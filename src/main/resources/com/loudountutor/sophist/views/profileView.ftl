<#-- @ftlvariable name="student" type="com.loudountutor.sophist.model.Student" -->
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]>-->
<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
    <meta charset="utf-8">
    <title>Profile | Loudoun Tutor</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <!-- Useful for showing description and other details for Search Engine searches-->
    <meta content="Sophist is open directory for connecting with experts" name="description">
    <meta content="tutors teachers tutoring teaching" name="keywords">
    <meta content="sophist" name="author">

    <link rel="shortcut icon" href="favicon.ico">

    <!-- Fonts START -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
    <!-- Fonts END -->

    <!-- Global styles START -->
    <link href="/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Global styles END -->

    <!-- Page level plugin styles START -->
    <link href="/assets/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
    <link href="/assets/plugins/owl.carousel//assets/owl.carousel.css" rel="stylesheet">
    <!-- Page level plugin styles END -->

    <!-- Theme styles START -->
    <link href="/assets/pages/css/components.css" rel="stylesheet">
    <link href="/assets/corporate/css/style.css" rel="stylesheet">
    <link href="/assets/pages/css/portfolio.css" rel="stylesheet">
    <link href="/assets/corporate/css/style-responsive.css" rel="stylesheet">
    <link href="/assets/corporate/css/themes/red.css" rel="stylesheet" id="style-color">
    <link href="/assets/corporate/css/custom.css" rel="stylesheet">
    <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">

<!-- BEGIN HEADER -->
<div class="header">
    <div class="container">
        <a class="site-logo" href="/"><img src="/assets/corporate/img/logos/logo-corp-red.png" alt="Sophist"></a>

        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>

    </div>
</div>
<!-- Header END -->

<div class="main">
    <div class="container">
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
            <!-- BEGIN CONTENT -->
            <div class="col-md-12 col-sm-12">
                <h1>${student.firstName} ${student.lastName}</h1>
                <div class="content-page">
                    <div class="row margin-bottom-30">

                        <!-- BEGIN Image View-->
                        <div class="media">
                            <div class="media-left">
                                <img src="/assets/pages/img/works/img1.jpg" class="media-object" style="width:400px">
                            </div>
                        </div>
                        <!-- END Image View-->

                        <!-- BEGIN Subject -->
                        <div class="col-md-7">
                            <div class="row margin-bottom-15 blablabla">
                                <div class="col-md-6">
                                    <ul class="list-unstyled" id = "list">

                                    </ul>
                                </div>
                                <div class="col-md-6">
                                    <ul class="list-unstyled">

                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- END Subject -->
                    </div>

                </div>
            </div>
            <!-- END CONTENT -->
        </div>
        <!-- BEGIN SIDEBAR & CONTENT -->
    </div>
</div>

    <#include 'footer.ftl'>
    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="/assets/plugins/respond.min.js"></script>
    <![endif]-->
    <script src="/assets/plugins/jquery.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery-migrate.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="/assets/corporate/scripts/back-to-top.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="/assets/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="/assets/plugins/owl.carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->

    <script src="/assets/corporate/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initTwitter();
            Layout.initOWL();
            loadSubjectList();
        });
    </script>
    <!-- Script for loading subject list-->
    <script>
        function loadSubjectList() {
            $("#list").html("");
            $.getJSON("/tutor/${student.id}/subjects", function(result){
                console.log(result.subjects);
                $.each(result.subjects, function(i, field){
                    $("#list").append("<li>" + field + "</li>");
                });
            });
        }
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>