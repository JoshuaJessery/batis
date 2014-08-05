module.exports = function(grunt) {

  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
    clean: {
    	files: ['js/*']
    },
    /*文件压缩*/
    uglify: {
      options: {
    	separator: ';',
    	/*是否美化代码,如果设置为false代码就会压缩为一行*/
    	beautify: false,
        banner: '/*! <%= pkg.name %> <%= grunt.template.today("dd-mm-yyyy hh:mm:ss") %> */\n',
        /*在压缩的时候删除console调试信息*/
        compress: {
        	drop_console : true,
        	/*忽略掉死代码,比如:1==1这样永远成立得代码在编译的时候就会被忽略掉*/
        	dead_code : true,
        	/*删掉没有使用的代码*/
        	unused : true,
        }
      },
      dist: {
        files: {
          'js/<%= pkg.name%>-test.min.js': ['source/test.js'],
        }
      }
    },
    /*文件合并*/
    concat: {
    	  options: {
    	    separator: ';',
    	    beautify: false	
    	  },
    	  dist: {
    		  /*把source下的js文件合并成一个js文件,并且文件之间用';'分割*/
    		  files: [
    		          {
		    			  src: ['source/test1.js','source/test.js'],
		        		  dest: 'js/<%= pkg.name %>-aa.js'
    		          },
    		          {
		    			  src: ['source/test1.js','source/test2.js'],
		        		  dest: 'js/<%= pkg.name %>-bb.js'
    		          }
    		         ]
    	  }
    },
    /*代码规范检测 从jshintrc文件中读取规范规则*/	
    jshint: {
      options: {
        jshintrc: true
      },
      files: ['Gruntfile.js', 'source/**/*.js'],
    },
    /*css文件压缩*/
    cssmin: {
	  css: {
	    files: {
	      'static/css/style.min.css': ['source/css/style.css']
	    }
	  }
    },
    /*单元测试*/
    qunit: {
        files: ['webapp/**/*.jsp']
      },
    watch: {
    	files: ['source/*.js'],
    	tasks: ['uglify'],
    	options: {
    	      spawn: false,
    	}
    }
  });

  grunt.loadNpmTasks('grunt-contrib-clean');
  grunt.loadNpmTasks('grunt-contrib-uglify');
  grunt.loadNpmTasks('grunt-contrib-concat');
  grunt.loadNpmTasks('grunt-contrib-qunit');
  grunt.loadNpmTasks('grunt-contrib-jshint');
  grunt.loadNpmTasks('grunt-contrib-watch');
  
  grunt.registerTask('test', ['jshint']);

  grunt.registerTask('default', ['jshint', 'uglify']);

};