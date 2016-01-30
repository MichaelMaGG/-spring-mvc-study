<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>welcome to Micheal's Blog</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" type="text/css" />
	
    <style>
        body {
            padding-top: 50px;
            padding-bottom: 50px;
            color: #5a5a5a;
        }

        /* 轮播广告 */
        .carousel {
            height: 300px;
            margin-bottom: 60px;
        }
        .carousel .item {
            height: 300px;
            background-color: #000;
        }
        .carousel .item img {
            width: 100%;
        }
        .carousel-caption {
            z-index: 10;
        }
        .carousel-caption p {
            margin-bottom: 20px;
            font-size: 20px;
            line-height: 1.8;
        }

        /* 简介 */

        .summary {
            padding:1px 15px 15px 10px;
        }

        .summary .col-md-4 {
            margin-bottom: 20px;
            text-align: center;
        }

        /* 特性 */

        .feature-divider {
            margin: 40px 0;
        }
        .feature {
            padding: 30px 0;
        }
        .feature-heading {
            font-size: 50px;
            color: #2a6496;
        }
        .feature-heading .text-muted {
            font-size: 28px;
        }

        /* 响应式布局 */

        @media (max-width: 768px) {
            .summary {
                padding-right: 3px;
                padding-left: 3px;
            }
            .carousel {
                height: 300px;
                margin-bottom: 30px;
            }
            .carousel .item {
                height: 300px;
            }
            .carousel img {
                min-height: 300px;
            }
            .carousel-caption p {
                font-size: 16px;
                line-height: 1.4;
            }
            .feature-heading {
                font-size: 34px;
            }
            .feature-heading .text-muted {
                font-size: 22px;
            }
        }

        @media (min-width: 992px) {
            .feature-heading {
                margin-top: 120px;
            }
        }
        </style>
    </head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation" id="menu-nav">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">MichealGG's Blog</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
	        <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">目录<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#feature-tab" data-tab="tab-itemInfo">运输信息</a></li>
                        <li><a href="#feature-tab" data-tab="tab-ownerInfo">车主信息</a></li>
                        <li><a href="#feature-tab" data-tab="tab-carInfo">车辆信息</a></li>
                    </ul>
                </li>
                <li><a href="#" data-toggle="modal" data-target="#about-modal">关于</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- 广告轮播 -->
<div id="ad-carousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#ad-carousel" data-slide-to="0" class="active"></li>
        <li data-target="#ad-carousel" data-slide-to="1"></li>
    </ol>

    <div class="carousel-inner" role="listbox">

        <div class="item active">
            <img src="<%=request.getContextPath()%>/resources/imgs/chrome-big.jpg" alt="1 slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Chrome</h1>
                    <p>Google Chrome，又称Google浏览器，是一个由Google（谷歌）公司开发的网页浏览器。</p>
                </div>
            </div>
        </div>

        <div class="item">
            <img src="<%=request.getContextPath()%>/resources/imgs/firefox-big.jpg" alt="2 slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Firefox</h1>
                    <p>Mozilla Firefox</p>
                </div>
            </div>
        </div>
 
    </div>
    <a class="left carousel-control" href="#ad-carousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
    </a>
    <a class="right carousel-control" href="#ad-carousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
    </a>
</div>

<!-- 主要内容 -->
<div class="container summary">

    <!-- 特性 -->
    <ul class="nav nav-tabs" role="tablist" id="feature-tab">
        <li class="active"><a href="#tab-itemInfo" role="tab" data-toggle="tab">运输信息</a></li>
        <li><a href="#tab-ownerInfo" role="tab" data-toggle="tab">车主信息</a></li>
        <li><a href="#tab-carInfo" role="tab" data-toggle="tab">车辆信息</a></li>
    </ul>

    <div class="tab-content">
        <div class="tab-pane active" id="tab-itemInfo">
            <div class="row feature">
                <div class="col-md-7">
                    <h2 class="feature-heading">Google Chrome <span class="text-muted">使用最广的浏览器</span></h2>
                    <p class="lead">运输信息</p>
                </div>
            </div>
        </div>
        <div class="tab-pane" id="tab-ownerInfo">
            <div class="row feature">
                <div class="col-md-7">
                    <h2 class="feature-heading">Mozilla Firefox <span class="text-muted">美丽的狐狸</span></h2>
                    <p class="lead">车主信息</p>
                </div>
            </div>
        </div>
        <div class="tab-pane" id="tab-carInfo">
            <div class="row feature">
                <div class="col-md-7">
                    <h2 class="feature-heading">Safari <span class="text-muted">Mac用户首选</span></h2>
                    <p class="lead">车辆信息</p>
                </div>
            </div>
        </div>
        
    </div>

    <!-- 关于 -->
    <div class="modal fade" id="about-modal" tabindex="-1" role="dialog" aria-labelledby="modal-label"
         aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span
                            aria-hidden="true">&times;</span><span class="sr-only">关闭</span></button>
                    <h4 class="modal-title" id="modal-label">关于</h4>
                </div>
                <div class="modal-body">
                    <p>这是简介内容</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
    
</div>

<div>
    <div>
        <p>大傻子</p>
    </div>

    <hr class="divider">

    <footer>
        <p class="pull-right"><a href="#top">回到顶部</a></p>
        <p class="copyright">Copyright &copy; 2016 MichaelMaGG<br><a href="" rel="nofollow"></p>
    </footer>
</div>

    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

    <script>
    $(function () {
	$('#ad-carousel').carousel();
	$('#menu-nav .navbar-collapse a').click(function (e) {
	    var href = $(this).attr('href');
	    var tabId = $(this).attr('data-tab');
	    if ('#' !== href) {
	        e.preventDefault();
	        $(document).scrollTop($(href).offset().top - 70);
	        if (tabId) {
	            $('#feature-tab a[href=#' + tabId + ']').tab('show');
	        }
	    }
	});
    });
    </script>

  </body>
</html>
