<%-- 
    Document   : index
    Created on : Sep 14, 2016, 3:27:46 PM
    Author     : Jiaming
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>



    <head>
        <!--Using the viewport meta tag to control layout on mobile browsers-->
        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrapValidator.min.css" rel="stylesheet">
        <title>Compute Hash</title>

    </head>
    <body>       

        <div class="container">
            <div class="row">
                <div class="col-xs-1"></div>
                <div class="col-xs-10">
                    <div class="page-header">
                        <h1>Compute Hash</h1>
                        <h1><small> Type in String of data. Choose a hash Function. Submit!</small></h1>
                    </div>

                    <div class="row">
                        <form id="input" method="get" action="computeHash" data-toggle="validator">
                            <div class="form-group">
                                <input type="text" class="form-control" id="string" name="string" placeholder="Typy in text here" required="">
                            </div>
                            <div class="radio"> 
                                <label><input type="radio" name="hashFunction" value="MD5" checked> MD5</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="hashFunction" value="SHA1"> SHA-1</label>
                            </div>
                            <button type="submit" class="btn btn-success btn-block">Submit</button>
                        </form>

                    </div>
                </div>
                <div class="col-xs-1"></div>
            </div>
        </div>

        <!--        <footer class="footer navbar-fixed-bottom">
                    <div class="container">
                        <p class="text-capitalize">Produced by Jiaming NI</p>
                    </div>
                </footer>-->

        <!-- jQuery -->
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <script src="js/bootstrapValidator.min.js"></script>
    </body>
</html>
