<%-- 
    Document   : Menu
    Created on : 16 juin 2019, 19:06:26
    Author     : Gerson Elvestino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <title>e-Fahana | Accueil</title>
      <link rel="stylesheet" href="css/bootstrap.css">
      <link rel="stylesheet" href="css/AdminLTE.min.css">
      <link rel="stylesheet" href="css/_all-skins.min.css">
      <link rel="icon" href="Image/E-fahana.png">
      <link rel="stylesheet" href="css/home.css">
      <link rel="stylesheet" href="css/animate.css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper" style="overflow: hidden;">
            <header class="main-header">
                <a href="../../index2.html" class="logo">
                    <span class="logo-mini"><b style="font-size: 2.0em"><i>e</i></b><em>Fn</em></span>
                  <span class="logo-lg"><b style="font-size: 2.5em"><i>e</i></b>-Fahana</span>
                </a>
                <nav class="navbar navbar-static-top" style="height: 50px;">
                    <a href="#" data-toggle="push-menu">
                      <button type="button" class="btn btn-outline-primary" style="background-color: transparent; border: none;">
                          <image src="./Image/btnMenu.PNG" width="25px" height="25px">
                      </button>
                    </a>

                    <div class="navbar-custom-menu">
                      <ul class="nav navbar-nav">   
                        <!-- Profil de l'utilisateur -->
                        <li class="dropdown user user-menu">
                          <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="Image/p.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs"><%= request.getAttribute("nom")+" "+request.getAttribute("prenoms")%></span>
                          </a>
                          <ul class="dropdown-menu" style="border: none; border-top: none;">
                            <li class="user-header" style="height: 110px;">
                                <img src="Image/p.jpg" class="user-image" alt="User Image">
                                <p>
                                  <%= request.getAttribute("nom")+" "+request.getAttribute("prenoms") %>
                                  <small><%= request.getAttribute("tel") %></small>
                                </p>
                            </li>
                            <li class="user-footer">
                                <div class="row">
                                    <div class="col">
                                        <a href="#" class="btn btn-default btn-sm">Profile</a>
                                    </div>
                                    <div class="col">
                                        <a href="#" style="margin-left: 50px;" id="btnDeconnexion" class="btn btn-primary btn-sm">Deconnexion</a>
                                    </div> 
                                </div> 
                            </li>
                          </ul>
                        </li>
                      </ul>
                    </div>
                </nav>
            </header>

          <!-- =============================================== -->

    <!-- Left side column. contains the sidebar -->
    <aside class="main-sidebar toggled" style="margin-top: 20px;">
        <form action="#" method="get" class="sidebar-form">
          <div class="input-group">
              <input type="text" name="q" class="form-control" placeholder="Search..." style="border: none;">
                <span class="input-group-btn">
                    <button type="submit" id="search-btn" class="btn btn-primary">
                        <img src="Image/rech.png" width="20px" height="20px">
                    </button>
                </span>
          </div>
        </form>
        <hr class="separator"/>
        <!-- /.search form -->
        
        
        <!-- sidebar menu -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header"><small style="color: #37474F; margin-left: 4px;">Menu de Navigation</small></li>
            <hr class="separator">
            <li class="active">
                <a href="#">
                    <i><img src="Image/Dashboard.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Tableau de bord</span>
                </a>
            </li>
            <li>
                <a href="Commande">
                    <i><img src="Image/order.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Commande</span>
                </a>
            </li>
        <li class="treeview">
            <a href="#">
              <i><img src="Image/produits.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i>
              <span>Produits</span>
              <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
            </a>
            <ul class="treeview-menu">
              <li><a href="#"><i><img src="Image/point.png" width="10px" height="10px" style="margin-bottom: 3px;" class="mr-2"></i>Nos produits</a></li>
              <li><a href="#"><i><img src="Image/point.png" width="10px" height="10px" style="margin-bottom: 3px;" class="mr-2"></i>Stocks</a></li>
            </ul>
        </li>
        <li>
            <a href="#">
                <i><img src="Image/chart.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Bilan</span>
            </a>
        </li>
        <li class="treeview">
            <a href="#">
              <i><img src="Image/data.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Documents</span>
              <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
            </a>
            <ul class="treeview-menu">
              <li><a href="Client.jsp"><i><img src="Image/point.png" width="8px" height="8px" style="margin-bottom: 3px;" class="mr-2"></i>Clients</a></li>
              <li><a href="#"><i><img src="Image/point.png" width="8px" height="8px" style="margin-bottom: 3px;" class="mr-2"></i>Fournisseurs</a></li>
              <li><a href="#"><i><img src="Image/point.png" width="8px" height="8px" style="margin-bottom: 3px;" class="mr-2"></i>Livraisons</a></li>
              <li><a href="#"><i><img src="Image/point.png" width="8x" height="8px" style="margin-bottom: 3px;" class="mr-2"></i>Vendeurs</a></li>
              <li><a href="#"><i><img src="Image/point.png" width="8px" height="8px" style="margin-bottom: 3px;" class="mr-2"></i>Membres</a></li>
            </ul>
        </li>
        <li>
            <a href="#">
              <i><img src="Image/caisse.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Caisse</span>
            </a>
        </li>
        <hr class="separator"/>
        </ul>
    </aside>

    <!-- =============================================== -->

        <div class="content-wrapper">
            <div style="width: 100%; height: 350px; background: #357ca5;" id="titre">
                <img src='Image/Dash.png'>
            </div> 
            <div style="position: relative; top: -80px;">
                <div class="container-fluid" style="width: 100%;">
                    <div class="row p-2">
                        <div class="col-lg-3 col-xs-6">
                          <!-- small box -->
                          <div class="small-box bg-aqua box1" style="display: none;">
                            <div class="inner">
                                <h3><%= request.getAttribute("totalClient") %></h3>

                                <p>Clients</p>
                            </div>
                            <div class="icon">
                                <i><img src="Image/client.png" width="80" height="80"></i>
                            </div>
                            <a href="#" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i></a>
                          </div>
                        </div>
                        <!-- ./col -->
                        <div class="col-lg-3 col-xs-6 box2" style="display: none;">
                          <!-- small box -->
                          <div class="small-box bg-green">
                            <div class="inner">
                              <h3><%= request.getAttribute("produit") %></h3>

                              <p>Produits</p>
                            </div>
                            <div class="icon">
                                <i><img src="Image/prod.png" width="80" height="80"></i>
                            </div>
                            <a href="#" class="small-box-footer">More info <i class="fa fa-arrow-circle-right"></i></a>
                          </div>
                        </div>
                        <!-- ./col -->
                        <div class="col-lg-3 col-xs-6 box3" style="display: none;">
                          <!-- small box -->
                          <div class="small-box bg-yellow">
                            <div class="inner">
                              <h3><%= request.getAttribute("totalCommande") %></h3>

                              <p>Commandes</p>
                            </div>
                            <div class="icon">
                                <i><img src="Image/Commande.png" width="80" height="80"></i>
                            </div>
                            <a href="#" class="small-box-footer">More info <i class="fa fa-arrow-circle-right"></i></a>
                          </div>
                        </div>
                        <!-- ./col -->
                        <div class="col-lg-3 col-xs-6 box4" style="display: none;">
                          <!-- small box -->
                          <div class="small-box bg-red">
                            <div class="inner">
                              <h3><%= request.getAttribute("caisse") %><sup style="font-size: 10px">Ar</sup></h3>

                              <p>Caisse</p>
                            </div>
                            <div class="icon">
                                <i><img src="Image/Caiss.png" width="80" height="80"></i>
                            </div>
                            <a href="#" class="small-box-footer">More info<i class="fa fa-arrow-circle-right"></i></a>
                          </div>
                        </div>
                        <!-- ./col -->
                    </div>
                    <hr class="separator1 h" style="display: none;">
                     
                    <div class="box wow slideInUp" data-wow-duration="3000ms">
                        <div class="box-header with-border">
                            <h3 class="box-title">B   I   L   A   N </h3>
                        </div>
                        
                        <div class="box-body">
                            <div class="row">
                                <div class="col-md-8">
                                    <p class="text-center" style="font-size: 0.9em;">
                                        <b>Produits les plus commandés par le client</b>
                                    </p>

                                    <div class="chart">
                                        <canvas class="chart" id="areaChart" style="height: 180px; width: 703px;" width="703" height="180"></canvas>
                                    </div>
                                </div>
                                
                                <div class="col-md-4">
                                    <p class="text-center" style="font-size: 0.9em;">
                                        <b>Taux en pourcent (%)</b>
                                    </p>

                                    <div class="progress-group">
                                        <span class="progress-text" style="color: black;">Airtel</span>
                                        <span class="progress-number" style="color: black;"><b class="badge badge-danger" style="font-size: 1.0em;"><%= request.getAttribute("countCommandeAirtel") %></b> / <b><%= request.getAttribute("countCommande") %></b></span>

                                        <div class="progress" style="height: 20px;">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated bg-danger" style="width: <%= request.getAttribute("percentAirtel") %>%;"><b><%= request.getAttribute("percentAirtel") %>%</b></div>
                                        </div>
                                    </div>
                                    <div class="progress-group" style="margin-top: 10px;">
                                        <span class="progress-text" style="color: black;">Orange</span>
                                        <span class="progress-number" style="color: black;"><b class="badge badge-warning" style="font-size: 1.0em;"><%= request.getAttribute("countCommandeOrange") %></b> / <b><%= request.getAttribute("countCommande") %></b></span>

                                        <div class="progress" style="height: 20px;">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated bg-orange" style="width: <%= request.getAttribute("percentOrange") %>%"><b><%= request.getAttribute("percentOrange") %>%</b></div>
                                        </div>
                                    </div>
                                    <div class="progress-group" style="margin-top: 10px;">
                                        <span class="progress-text" style="color: black;">Telma</span>
                                        <span class="progress-number" style="color: black;"><b class="badge badge-success" style="font-size: 1.0em;"><%= request.getAttribute("countCommandeTelma") %></b> / <b><%= request.getAttribute("countCommande") %></b></span>

                                        <div class="progress" style="height: 20px;">
                                            <div class="progress-bar progress-bar-striped progress-bar-animated bg-success" style="width: <%= request.getAttribute("percentTelma") %>%"><b><%= request.getAttribute("percentTelma") %>%</b></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="box-footer">
                            <div class="row">
                                <div class="col-sm-4 col-xs-6">
                                    <div class="description-block border-right">
                                        <span class="description-percentage text-red"><i class="fa fa-caret-up"></i>Airtel</span>
                                        <h5 class="description-header"><%= request.getAttribute("montantTotalAirtel") %> <b style="color: #f44336;">Ar</b></h5>
                                        <span class="description-text" style="color: #242424">Montant total Commande</span>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-xs-6">
                                    <div class="description-block border-right">
                                        <span class="description-percentage text-yellow"><i class="fa fa-caret-left"></i>Orange</span>
                                        <h5 class="description-header"><%= request.getAttribute("montantTotalOrange") %> <b style="color: #f44336;">Ar</b></h5>
                                        <span class="description-text" style="color: #242424">Montant total Commande</span>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-xs-6">
                                    <div class="description-block border-right">
                                        <span class="description-percentage text-green"><i class="fa fa-caret-up"></i>Telma</span>
                                        <h5 class="description-header"><%= request.getAttribute("montantTotalTelma") %> <b style="color: #f44336;">Ar</b></h5>
                                        <span class="description-text" style="color: #242424">Montant total Commande</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    
                    <div class="container-fluid">
                        <div class="box box-solid wow slideInRight" data-wow-duration="1500ms">
                            <div class="box-header with-border">
                                <h4 class="box-title"><b style="color: #f44336;">C</b>ommande | <b style="color: #f44336;">C</b>aisse</h4>
                            </div>
                            <div class="box-body">
                                <div class="row">
                                    <div class="col-6" style="border-right: 3px solid #17a2b8;">
                                        <h4 class="text-center"><b>T O T A L</b></h4>
                                        <table class="table table-bordered table-hover" style="text-align: center;">
                                            <style>

                                            </style>
                                            <thead style="background-color: #17a2b8; color: white;">
                                                <th>Aujourd'hui</th>
                                                <th>Tous</th>
                                            </thead>
                                            <tr>
                                                <td><h3 class="badge bg-blue" style="font-size: 2.5em;"><b><%= request.getAttribute("totalCommandeToday") %></b></h3></td>
                                                <td><h3 class="badge bg-blue" style="font-size: 2.5em;"><b><%= request.getAttribute("totalCommande") %></b></h3></td>
                                            </tr>
                                        </table>  
                                    </div>
                                    <div class="col-6">
                                        <h4 class="text-center"><b>M O N T A N T</b></h4>
                                        <table class="table table-bordered table-hover" style="text-align: center;">
                                            <style>

                                            </style>
                                            <thead style="background-color: #17a2b8; color: white;">
                                                <th>Aujourd'hui</th>
                                                <th>Tous</th>
                                            </thead>
                                            <tr>
                                                <td><h3 style="font-size: 2.6em;"><b><%= request.getAttribute("totalMontantCommandeToday") %></b><em style="color: red;"> Ar</em></h3></td>
                                                <td><h3 style="font-size: 2.6em;"><b><%= request.getAttribute("totalMontantCommande") %></b><em style="color: red;"> Ar</em></h3></td>
                                            </tr>
                                        </table>  
                                        <div class="float-right"><small><b><u>NB</u>: </b></small><small style="color: red;">à payer</em></small></div>
                                    </div>
                                </div>
                                <hr>
                                <center>
                                    <div class="mt-4" style="width: 50%">
                                        <h4 class="text-center" style="font-size: 2.0em;"><b style="color: #f44336;">Montant</b> en CAISSE</h4>
                                        <h3 class="badge badge-success" style="font-size: 5.5em;"><b><%= request.getAttribute("caisse") %></b><em style="color: #FFF;"> Ar</em></h3>
                                        <center><div><small><b><u>NB</u>: </b></small><small style="color: red;">Dejà payer</em></small></div></center>
                                    </div>
                                </center>
                            </div>
                          <!-- /.box-body -->
                        </div>
                    </div>
                    <div class="wow animated slideInLeft">
                        <div class="box box-widget widget-user">
                            <div class="widget-user-header bg-aqua-active">
                                <h3 class="widget-user-username"><%= request.getAttribute("nom")+" "+request.getAttribute("prenoms")%></h3>
                                <h5 class="widget-user-desc"><%= request.getAttribute("tel") %></h5>
                            </div>
                            <div class="widget-user-image">
                                <center><img class="img-circle" src="Image/p.jpg" alt="User Avatar"style="width: 150px; height: 150px; border-radius: 50%; margin-top: -20px;"></center>
                            </div>
                            <div class="box-footer" style="margin-top: 100px;">
                                <div class="row">
                                    <div class="col-sm-4 border-right">
                                        <div class="description-block">
                                            <h5 class="description-header"><%= request.getAttribute("totalCommandeVendeur") %></h5>
                                            <span class="description-text" style="color: black;">Commande Faite</span>
                                        </div>
                                    </div>
                                    <div class="col-sm-4 border-right">
                                        <div class="description-block">
                                            <h5 class="description-header"><%= request.getAttribute("totalMontantVendeur") %> Ar</h5>
                                            <span class="description-text" style="color: black;">Montant total non Validé</span>
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="description-block">
                                            <h5 class="description-header"><%= request.getAttribute("totalCaisseVendeur") %> Ar</h5>
                                            <span class="description-text" style="color: black;">Montant en caisse</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ./wrapper -->
        <script src="js/jquery.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/jquery.slimscroll.min.js"></script>
        <script src="js/fastclick.js"></script>
        <script src="js/adminlte.min.js"></script>
        <script src="js/demo.js"></script>
        <script src="js/sweetalert2.all.min.js"></script>
        <script src="js/Chart.min.js"></script>
        <script src="js/sweetalert2.all.min.js"></script>
        <script src="js/chart.js"></script>
        <script src="js/pie.js"></script>
        <script src="js/anime.js"></script>
        <script src="js/wow.js"></script>
        <script>
            wow = new WOW({
                animateClass: 'animated',
                offset: 100,
                callback: function(box) {
                    console.log("WOW: animating <" + box.tagName.toLowerCase() + ">")
                }
            });
            wow.init();
            btnDec = $('#btnDeconnexion');
            box1 = $('.box1');
            box2 = $('.box2');
            box3 = $('.box3');
            box4 = $('.box4');
            chart1 = $('.chart1');
            separator = $('.h');
            btnDec.click(function() {
                Swal.fire({
                  title: 'Deconnexion',
                  text: "Voulez vous vraiment se deconnectez?",
                  type: 'warning',
                  showCancelButton: true,
                  confirmButtonColor: '#3085d6',
                  cancelButtonColor: '#d33',
                  cancelButtonText: 'Annuler',
                  confirmButtonText: 'Oui'
                }).then((result) => {
                    if (result.value) {
                        let timerInterval
                        Swal.fire({
                            title: 'Déconnexion en cours!',
                            timer: 3000,
                            onBeforeOpen: () => {
                              Swal.showLoading()
                              timerInterval = setInterval(() => {
                                Swal.getContent().querySelector('strong')
                                  .textContent = Swal.getTimerLeft()
                              }, 100)
                            },
                            onClose: () => {
                              clearInterval(timerInterval)
                            }
                        }).then((result) => {
                            if (
                              // Read more about handling dismissals
                              result.dismiss === Swal.DismissReason.timer
                            ) {
                              console.log('I was closed by the timer')
                            }
                        });
                        setTimeout(function() {
                            window.location.href = "Deconnexion";
                        }, 3100);
                  }
                });             
            });
            
            $(document).ready(function (){
                box1.show();
                anime({
                    targets: '.box1',
                    scale: [0,1],
                    opacity: [0,1],
                    duration: 1000,
                    delay:200
                });
               
                box2.show();
                anime({
                   targets: '.box2',
                   scale: [0,1],
                   opacity: [0,1],
                   duration: 2000,
                   delay:300
                });
                
                box3.show();
                anime({
                   targets: '.box3',
                   scale: [0,1],
                   opacity: [0,1],
                   duration: 3000,
                   delay:400
                });
                
                box4.show();
                anime({
                   targets: '.box4',
                   scale: [0,1],
                   opacity: [0,1],
                   duration: 4000,
                   delay:500
                });
                
                
                separator.show();
                anime({
                    targets: '.h',
                    scale: [0,1],
                    opacity: [0,1],
                    duration: 5000
                });
                
                chart1.toggle('slide', {direction: 'down'}, 2000);
            });
        </script>
    </body>
</html>

