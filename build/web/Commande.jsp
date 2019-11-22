
<%-- 
    Document   : Commande
    Created on : 19 juin 2019, 14:12:47
    Author     : Gerson Elvestino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>e-Fahana | Commande</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/AdminLTE.min.css">
        <link rel="stylesheet" href="css/_all-skins.min.css">
        <link rel="icon" href="Image/E-fahana.png">
        <link rel="stylesheet" href="css/home.css">
        <link rel="stylesheet" href="css/lobibox.css">
        <link rel="stylesheet" href="dataTable/css/dataTables.bootstrap4.css">
        <link rel="stylesheet" href="css/loading.css">
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
            <li>
                <a href="Menu">
                    <i><img src="Image/Dashboard.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Tableau de bord</span>
                </a>
            </li>
            <li class="active">
                <a href="#">
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
                <img src='Image/Ban_Commande.png'>
            </div> 
            <hr class="separator2">
            <div class="container-fluid">
                        
                <!-- Modal ajout commande -->
                <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                    <div class="modal-dialog modal-dialog-centered" role="document">
                      <div class="modal-content">
                        <div class="modal-header">
                            <h7><b class="modal-title" id="exampleModalCenterTitle">NOUVEAU COMMANDE</b></h7>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body ajout" style="height: 350px;">

                            <%-- PREMIER SLIDE --%>
                            <div class="box box-widget widget-user-2 slide1">
                                <div class="widget-user-header ajoutHeader" style="border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);">
                                  <h3 style="color: white">C L I E N T</h3>
                                  <img style="float: right; top: -50px; position: relative;" src="Image/client.png" width="80" height="80">
                                  <h5 style="color: white; font-size: 0.8em">Les informations concernant le client</h5>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group">
                                        <label><b>Nom :</b></label><em style="color: red;">*</em>
                                        <input class="form-control form-control-sm nom" type="text" placeholder="Nom du client" id="nomClient">
                                        <small>Veuillez saisir le nom du client en <b>Majuscule</b></small>
                                        <div class="shadow-sm bg-white" id="sugNomClient" style="position: absolute; width: 450px; display: none; z-index: 1000;">
                                            <ul class="list-unstyled"></ul>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <form name="ajout" id="ajout">
                                            <label><b>Prénoms :</b></label><em style="color: red;">*</em>
                                            <input class="form-control form-control-sm prenom" type="text" placeholder="Prénoms du client" name="prenom" id="prenom">
                                        </form>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <label><b>Adresse :</b></label><em style="color: red;">*</em>
                                            <input class="form-control form-control-sm adresse" type="text" placeholder="Adresse du client">
                                        </div>
                                        <div class="col">
                                            <label><b>Téléphone :</b></label><em style="color: red;">*</em>
                                            <input class="form-control form-control-sm tel" type="text" placeholder="+261 3(2/3/4)">
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <%-- DEUXIEME SLIDE --%>
                            <div class="box box-widget widget-user-2 slide2" style="display: none;">
                                <div class="widget-user-header ajoutHeader" style="border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);">
                                    <h6 style="color: white"><b>Appartenant au client :</b></h6>
                                    <img style="float: right; top: -20px; position: relative;" src="Image/client.png" width="100" height="100">
                                    <ul>
                                        <li><h5 style="color: white; font-size: 0.8em">Numero : <b style="color: white; font-size: 1em;" class="numCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Nom : <b style="color: white; font-size: 1em;" class="nomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Prénoms : <b style="color: white; font-size: 1em;" class="prenomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Adresse : <b style="color: white; font-size: 1em;" class="adresseCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Téléphone : <b style="color: white; font-size: 1em;" class="telCom"></b></h5></li>
                                    </ul>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group chooseProd">
                                        <center>
                                            <h3><b>Credit :</b></h3>
                                            <label><em style="color: red;">*</em><small>Veuillez <b>cochez</b> le credit que ce client souhaite commandé</small></label>
                                        </center>
                                        <div class="form-check">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input" value="tab1" id="airtel">Aitel
                                            </label>
                                        </div>
                                        <div class="form-check disabled">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input" value="tab2" id="orange">Orange
                                            </label>
                                        </div> 
                                        <div class="form-check">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input" value="tab3" id="telma">Telma
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <%-- TROISIEME SLIDE --%>
                            <div class="box box-widget widget-user-2 slide3" style="display: none">
                                <div class="widget-user-header ajoutHeader" style="border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);">
                                    <h6 style="color: white"><b>Appartenant au client :</b></h6>
                                    <img style="float: right; top: -20px; position: relative;" src="Image/client.png" width="100" height="100">
                                    <ul>
                                        <li><h5 style="color: white; font-size: 0.8em">Numero : <b style="color: white; font-size: 1em;" class="numCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Nom : <b style="color: white; font-size: 1em;" class="nomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Prénoms : <b style="color: white; font-size: 1em;" class="prenomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Adresse : <b style="color: white; font-size: 1em;" class="adresseCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Téléphone : <b style="color: white; font-size: 1em;" class="telCom"></b></h5></li>
                                    </ul>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group ajoutQuantite">
                                        <hr class="separator1">
                                        <div style="overflow-y: scroll; height: 170px;">
                                            <div class="tab1" style="display: none;">
                                                <center><h5>Credit Airtel</h5></center>
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>Prix</th>
                                                            <th>En stock</th>
                                                            <th>Quantité</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach var="air" items="${prodAirtel}">
                                                            <tr>
                                                                <td><c:out value="${air.code}"/></td>
                                                                <td><c:out value="${air.prix}"/></td>
                                                                <td><c:out value="${air.qte}"/></td>
                                                                <td><input class="form-control quantiteCommande" type="text" placeholder="Entrer Quantité" data-pu="<c:out value="${air.prix}"/>" id="<c:out value="${air.code}"/>"></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>

                                            <div class="tab2" style="display: none;">
                                                <center><h5>Credit Orange</h5></center>
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>Prix</th>
                                                            <th>En stock</th>
                                                            <th>Quantité</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach var="orange" items="${prodOrange}">
                                                            <tr>
                                                                <td><c:out value="${orange.code}"/></td>
                                                                <td><c:out value="${orange.prix}"/></td>
                                                                <td><c:out value="${orange.qte}"/></td>
                                                                <td><input class="form-control quantiteCommande" type="text" placeholder="Entrer Quantité" data-pu="<c:out value="${orange.prix}"/>" id="<c:out value="${orange.code}"/>"></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>

                                            <div class="tab3" style="display: none;">
                                                <center><h5>Credit Telma</h5></center>
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>Prix</th>
                                                            <th>En stock</th>
                                                            <th>Quantité</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach var="tel" items="${prodTelma}">
                                                            <tr>
                                                                <td><c:out value="${tel.code}"/></td>
                                                                <td><c:out value="${tel.prix}"/></td>
                                                                <td><c:out value="${tel.qte}"/></td>
                                                                <td><input class="form-control quantiteCommande" type="text" data-pu="<c:out value="${tel.prix}"/>" placeholder="Entrer Quantité" id="<c:out value="${tel.code}"/>"></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>  
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- QUATRIEME SLIDE -->
                            <div class="box box-widget widget-user-2 slide4" style="display: none;">
                                <div class="widget-user-header ajoutHeader" style="border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);">
                                    <h6 style="color: white"><b>Appartenant au client :</b></h6>
                                    <img style="float: right; top: -20px; position: relative;" src="Image/client.png" width="100" height="100">
                                    <ul>
                                        <li><h5 style="color: white; font-size: 0.8em">Numero : <b style="color: white; font-size: 1em;" class="numCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Nom : <b style="color: white; font-size: 1em;" class="nomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Prénoms : <b style="color: white; font-size: 1em;" class="prenomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Adresse : <b style="color: white; font-size: 1em;" class="adresseCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Téléphone : <b style="color: white; font-size: 1em;" class="telCom"></b></h5></li>
                                    </ul>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group chooseProd">
                                        <center>
                                            <h3 style="font-size: 1.0em;"><b>Contenu du Commande</b></h3>
                                        </center>
                                        <div class="form-check" style="overflow-y: scroll; height: 170px;">
                                            <div class="tabContenu">
                                                <hr class="separator">
                                                <table class="table table-bordered" style="font-size: 0.8em;">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>Prix Unitaire</th>
                                                            <th>Quantité</th>
                                                            <th>Montant</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody id="bodyTabContenu">
                                                        
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                        <h4 style="float: right; font-size: 0.9em;" class="mt-4">Total : <b id="textTotal"></b><b style="color: #F44336"> Ariary</b></h4>
                                    </div>
                                </div>
                            </div>
                            
                            <!-- CINQUIEME SLIDE -->
                            <div class="box box-widget widget-user-2 slide5" style="display: none;">
                                <div class="widget-user-header ajoutHeader" style="border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);">
                                    <h6 style="color: white"><b>Appartenant au client :</b></h6>
                                    <img style="float: right; top: -20px; position: relative;" src="Image/client.png" width="100" height="100">
                                    <ul>
                                        <li><h5 style="color: white; font-size: 0.8em">Numero : <b style="color: white; font-size: 1em;" class="numCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Nom : <b style="color: white; font-size: 1em;" class="nomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Prénoms : <b style="color: white; font-size: 1em;" class="prenomCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Adresse : <b style="color: white; font-size: 1em;" class="adresseCom"></b></h5></li>
                                        <li><h5 style="color: white; font-size: 0.8em">Téléphone : <b style="color: white; font-size: 1em;" class="telCom"></b></h5></li>
                                    </ul>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group chooseProd">
                                        <center>
                                            <h3 style="font-size: 1.0em;"><b>Contenu du Commande</b></h3>
                                        </center>
                                        <div class="form-check" style="overflow-y: scroll; height: 170px;">
                                            <div class="tabContenu">
                                                <hr class="separator">
                                                <table class="table table-bordered" style="font-size: 0.8em;">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>Prix Unitaire</th>
                                                            <th>Quantité</th>
                                                            <th>Montant</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody id="bodyTabContenu">
                                                        
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                        <h4 style="float: right; font-size: 0.9em;" class="mt-4">Total : <b id="textTotal"></b><b style="color: #F44336"> Ariary</b></h4>
                                    </div>
                                </div>
                            </div>

                            <!-- loading page -->
                            <div id="panelLoading" style="overflow-x: hidden;overflow-y: auto;background: rgba(0, 0, 0, 0.8);position:absolute;top: 0;right: 0;bottom: 0;left: 0;z-index: 1050;overflow: hidden;outline: 0;color: white; display: none;">
                                <div style="position: absolute; width: 80px; right: 100px;" class="loading">
                                <div class="obj1"></div>
                                <div class="obj2"></div>
                                <div class="obj3"></div>
                                <div class="obj4"></div>
                                <div class="obj5"></div>
                                <div class="obj6"></div>
                                <div class="obj7"></div>
                                <div class="obj8"></div>
                                </div>
                            </div>
                        </div>
                            <center>
                                <div class="alert mesFalse1 text-center ajoutHeader" role="alert" style="background-color: #F44336; width: 60%; display: none;">
                                    <small style="color: white;"><b>Veuillez completez tous les champs!</b></small>
                                </div>
                                <div class="alert mesFalse2 text-center ajoutHeader" role="alert" style="background-color: #F44336; width: 60%; display: none;">
                                    <small style="color: white;"><b>Vous devez cocher au moins un credit!</b></small>
                                </div>
                                <div class="alert mesFalse3 text-center ajoutHeader" role="alert" style="background-color: #F44336; width: 60%; display: none;">
                                    <small style="color: white;"><b>Entrer au moins un quantité!</b></small>
                                </div> 
                            </center>
                            <div class="modal-footer">
                            <button type="button" class="btn btn-secondary btn-sm" data-dismiss="modal">Annuler</button>
                            <button type="button" class="btn btn-warning btn-sm btnPrev" style="color: #ffffff; display: none;">Précédent</button>
                            <button type="button" class="btn btn-primary btn-sm btnSuivant"><b id="nameBtnSuivant">Suivant</b></button>
                        </div>
                      </div>
                    </div>
                </div>
                <!-- fin Modal ajout commande -->

                
                
                
                <div class="row">
                    <div class="col-md-12">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-8">
                                    <div class="box box-widget widget-user-2">
                                        <div class="widget-user-header bg-info">
                                          <h3 style="color: white">Vos Commandes</h3>
                                          <h5 style="color: white; font-size: 0.8em">Les commandes que vous avez enregistrés</h5>
                                          <button type="button" class="btn btn-success btn-sm modalAjout float-right" data-toggle="modal" data-target="#exampleModalCenter" style="margin-top: -50px; height: 35px;"><b>+ Nouveau</b></button>
                                        </div>
                                        <div class="box-footer">
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
                                                            <td><h3 class="badge bg-blue" style="font-size: 1.5em;"><b><%= request.getAttribute("totalCommandeVendeurToday") %> / <%= request.getAttribute("totalCommandeToday") %></b></h3></td>
                                                            <td><h3 class="badge bg-blue" style="font-size: 1.5em;"><b><%= request.getAttribute("totalCommandeVendeur") %> / <%= request.getAttribute("totalCommande") %></b></h3></td>
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
                                                            <td><h3><b><%= request.getAttribute("totalMontantVendeurToday") %></b><em style="color: red;"> Ar</em></h3></td>
                                                            <td><h3><b><%= request.getAttribute("totalMontantVendeur") %></b><em style="color: red;"> Ar</em></h3></td>
                                                        </tr>
                                                    </table>  
                                                    <div class="float-right"><small><b><u>NB</u>: </b></small><small style="color: red;">à payer</em></small></div>
                                                </div>
                                            </div>
                                            <div style="border-top: 3px solid #17a2b8; margin-top: 5px;">
                                                <div>
                                                    <h4 class="text-center" style="margin-top: 5px;"><b>P R O D U I T S</b></h4>
                                                    <center><small class="text-center">Pourcentage des produits les plus commandés<em style="color: red;">*</em></small></center>
                                                    <small class="float-right"><b>Airtel</b></small>
                                                    <div class="progress" style="margin-top: 18px; height: 20px;">
                                                        <div class="progress-bar progress-bar-striped bg-danger progress-bar-animated" style="width:<%= request.getAttribute("pourcentageAirtel") %>%;"><b> <%= request.getAttribute("pourcentageAirtel") %>% </b></div>
                                                    </div> 
                                                    <small class="float-right"><b>Orange</b></small>
                                                    <div class="progress" style="margin-top: 18px; height: 20px;">
                                                        <div class="progress-bar progress-bar-striped bg-warning progress-bar-animated" style="width:<%= request.getAttribute("pourcentageOrange") %>%"><b> <%= request.getAttribute("pourcentageOrange") %>% </b></div>
                                                    </div> 
                                                    <small class="float-right"><b>Telma</b></small>
                                                    <div class="progress" style="margin-top: 18px; height: 20px;">
                                                        <div class="progress-bar progress-bar-striped bg-success progress-bar-animated" style="width:<%= request.getAttribute("pourcentageTelma") %>%"><b> <%= request.getAttribute("pourcentageTelma") %>% </b></div>
                                                    </div> 
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="box box-widget widget-user-2">
                                        <div class="widget-user-header bg-info">
                                          <h3 style="color: white">Stock</h3>
                                          <h5 style="color: white; font-size: 0.8em">Les produits disponibles en stock</h5>
                                          <button class="btn btn-success" style="float: right;" data-toggle="modal" data-target="#ajoutStock">+</button>
                                        </div>
                                        <div class="box-footer">
                                            <div id="demo" class="carousel slide" data-ride="carousel">
                                                <ul class="carousel-indicators">
                                                    <li data-target="#demo" data-slide-to="0" class="active" style="border: 3px solid red; background-color: red;"></li>
                                                    <li data-target="#demo" data-slide-to="1" style="border: 3px solid orange; background-color: orange;"></li>
                                                    <li data-target="#demo" data-slide-to="2" style="border: 3px solid green; background-color: green;"></li>
                                                </ul>
                                                <div class="carousel-inner">
                                                    <div class="carousel-item active" style="height: 331px;">
                                                        <center>
                                                            <img src="Image/air.PNG" width="150" height="auto" style="margin-top: 20px;">
                                                        </center>
                                                        <table class="table" style="font-size: 0.8em; text-align: center; margin-top: 30px;">
                                                            <thead style="color: white;" class="bg-red">
                                                                <tr>
                                                                    <th scope="col">Code</th>
                                                                    <th scope="col">P.U</th>
                                                                    <th scope="col">Quantité</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach var="air" items="${prodAirtel}">
                                                                    <tr>
                                                                        <td><c:out value="${air.code}"/></a></td>
                                                                        <td><c:out value="${air.prix}"/></td>
                                                                        <td class="badge bg-red" style="font-size: 1.0em"><c:out value="${air.qte}"/></td>
                                                                    </tr>
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                    <div class="carousel-item" style="height: 331px;">
                                                        <center>
                                                            <img src="Image/or.PNG" width="150" height="auto" style="margin-top: 20px;">
                                                        </center>
                                                        <table class="table" style="font-size: 0.8em; text-align: center; margin-top: 20px;">
                                                            <thead style="color: white;" class="bg-orange">
                                                                <tr>
                                                                    <th scope="col">Code</th>
                                                                    <th scope="col">P.U</th>
                                                                    <th scope="col">Quantité</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach var="orange" items="${prodOrange}">
                                                                    <tr>
                                                                        <td><c:out value="${orange.code}"/></a></td>
                                                                        <td><c:out value="${orange.prix}"/></td>
                                                                        <td class="badge bg-orange" style="font-size: 1.0em"><c:out value="${orange.qte}"/></td>
                                                                    </tr>
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                    <div class="carousel-item" style="height: 331px;">
                                                        <center>
                                                            <img src="Image/tel.png" width="150" height="auto" style="margin-top: 20px;">
                                                        </center>
                                                        <table class="table" style="font-size: 0.8em; text-align: center; margin-top: 30px;">
                                                            <thead style="color: white;" class="bg-green">
                                                                <tr>
                                                                    <th scope="col">Code</th>
                                                                    <th scope="col">P.U</th>
                                                                    <th scope="col">Quantité</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach var="telma" items="${prodTelma}">
                                                                    <tr>
                                                                        <td><c:out value="${telma.code}"/></a></td>
                                                                        <td><c:out value="${telma.prix}"/></td>
                                                                        <td class="badge bg-green" style="font-size: 1.0em"><c:out value="${telma.qte}"/></td>
                                                                    </tr>
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>   
                        </div>
                        <hr class="separator1">
                        <h4 style="text-align: center;">Listes des clients qui ont commandés</h4>
                        
                        <table class="table table-bordered table-borderless bg-light" id="mytable" style="width: 100%;">
                            <thead style="background-color: #3c8dbc; color: white;">
                                <th scope="col">Numero</th>
                                <th scope="col">Nom</th>
                                <th scope="col">Prenom</th>
                                <th scope="col">Adresse</th>
                                <th scope="col">Telephone</th>
                            </thead>
                            <tbody>
                                <c:forEach var="l" items="${list}">
                                    <tr>
                                        <td scope="row"><a data-toggle="collapse" href="#${l.num}" role="button" aria-expanded="false" aria-controls="collapseExample"><c:out value="${l.num}"/></a></td>
                                        <td><c:out value="${l.nom}"/></td>
                                        <td><c:out value="${l.prenom}"/></td>
                                        <td><c:out value="${l.adresse}"/></td>
                                        <td><c:out value="${l.tel}"/></td>
                                    </tr>
                                </c:forEach>
                                    
                                <c:forEach var="l" items="${list}">
                                    <!-- collapse liste commande d'un client -->
                                    <div class="collapse" id="${l.num}" style="margin-top: 5px;">
                                        <div class="card card-body">

                                            <!-- AJAX SERVLET -->

                                        </div>
                                    </div>
                                    <!-- fin collapse liste commande d'un client -->
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                
                <div class="box-footer" style="margin-top: 10px;">
                    <div class="row">
                        <div class="col-sm-4 col-xs-6">
                            <div class="description-block border-right">
                                <h5 class="description-header"><img src="Image/air.PNG" width="130"></h5>
                            </div>
                        </div>
                        <div class="col-sm-4 col-xs-6">
                            <div class="description-block border-right">
                                <h5 class="description-header"><img src="Image/tel.png" width="130"></h5>
                            </div>
                        </div>
                        <div class="col-sm-4 col-xs-6">
                          <div class="description-block">
                            <h5 class="description-header"><img src="Image/or.PNG" width="130"></h5>
                          </div>
                        </div>
                    </div>
                  <!-- /.row -->
                </div>
            </div>
            
            <!-- The Modal -->
            <div class="modal fade" id="ajoutStock">
                <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                        <!-- Modal Header -->
                        <div class="modal-header">
                          <h4 class="modal-title">Stock produit</h4>
                          <button type="button" class="close" data-dismiss="modal">x</button>
                        </div>

                        <!-- Modal body -->
                        <div class="modal-body ajoutStock" style="height: 300px;">
                            
                            <!-- Premiere slide en stock -->
                            <div class="box box-widget widget-user-2 slideStock1">
                                <div class="widget-user-header" style="border: 1px solid #17a2b8; background: #17a2b8;">
                                    <h3 style="color: white">S T O C K</h3>
                                    <img style="float: right; top: -50px; position: relative;" src="Image/stocks.png" width="80" height="80">
                                    <h5 style="color: white; font-size: 0.8em">Ajouter nouveau stock</h5>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group chooseProdStock">
                                        <center>
                                            <h3><b>Credit</b></h3>
                                            <label><em style="color: red;">*</em><small>Veuillez <b>cochez</b> le credit que vous souhaitez ajouter des stocks</small></label>
                                        </center>
                                        <div class="form-check">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input" value="stock1" id="airtel">Aitel
                                            </label>
                                        </div>
                                        <div class="form-check disabled">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input" value="stock2" id="orange">Orange
                                            </label>
                                        </div> 
                                        <div class="form-check">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input" value="stock3" id="telma">Telma
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <!-- Deuxième slide en stock -->
                            <div class="box box-widget widget-user-2 slideStock2" style="display: none">
                                <div class="widget-user-header" style="border: 1px solid #17a2b8; background: #17a2b8;">
                                    <h3 style="color: white">S T O C K</h3>
                                    <img style="float: right; top: -50px; position: relative;" src="Image/stocks.png" width="80" height="80">
                                    <h5 style="color: white; font-size: 0.8em">Ajouter nouveau stock</h5>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group ajoutQuantiteStock">
                                        <hr class="separator1">
                                        <div style="overflow-y: scroll; height: 200px;">
                                            <div class="stock1" style="display: none;">
                                                <center><h5>Credit Airtel</h5></center>
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>En stock</th>
                                                            <th>Quantité</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach var="air" items="${Airtel}">
                                                            <tr>
                                                                <td><c:out value="${air.code}"/></td>
                                                                <td><c:out value="${air.qte}"/></td>
                                                                <td><input class="form-control quantiteCommandeStock" type="text" placeholder="Entrer Quantité" data-qteS="<c:out value="${air.qte}"/>" id="<c:out value="${air.code}"/>"></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>

                                            <div class="stock2" style="display: none;">
                                                <center><h5>Credit Orange</h5></center>
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>En stock</th>
                                                            <th>Quantité</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach var="orange" items="${Orange}">
                                                            <tr>
                                                                <td><c:out value="${orange.code}"/></td>
                                                                <td><c:out value="${orange.qte}"/></td>
                                                                <td><input class="form-control quantiteCommandeStock" type="text" placeholder="Entrer Quantité" data-qteS="<c:out value="${orange.qte}"/>" id="<c:out value="${orange.code}"/>"></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>

                                            <div class="stock3" style="display: none;">
                                                <center><h5>Credit Telma</h5></center>
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Code</th>
                                                            <th>En stock</th>
                                                            <th>Quantité</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach var="tel" items="${Telma}">
                                                            <tr>
                                                                <td><c:out value="${tel.code}"/></td>
                                                                <td><c:out value="${tel.qte}"/></td>
                                                                <td><input class="form-control quantiteCommandeStock" type="text" data-qteS="<c:out value="${tel.qte}"/>" placeholder="Entrer Quantité" id="<c:out value="${tel.code}"/>"></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>  
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <!-- Toisième slide ajout stock -->
                            <div class="box box-widget widget-user-2 slideStock3" style="display: none;">
                                <div class="widget-user-header" style="border: 1px solid #17a2b8; background: #17a2b8;">
                                    <h3 style="color: white">S T O C K</h3>
                                    <img style="float: right; top: -50px; position: relative;" src="Image/stocks.png" width="80" height="80">
                                    <h5 style="color: white; font-size: 0.8em">Ajouter nouveau stock</h5>
                                </div>
                                <div class="box-footer">
                                    <div class="form-group chooseProdStock">
                                        <center>
                                            <h3 style="font-size: 1.0em;"><b>Contenu du stock</b></h3>
                                            <div class="form-check" style="overflow-y: scroll; height: 200px; width: 100%;">
                                                <div class="tabContenuStock">
                                                    <hr class="separator">
                                                    <table class="table table-bordered" style="font-size: 0.8em;">
                                                        <thead>
                                                            <tr>
                                                                <th>Code</th>
                                                                <th>En stock</th>
                                                                <th>Quantité saisie</th>
                                                                <th>TOTAL</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody id="bodyTabContenuStock">

                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>                              
                                        </center>
                                    </div>
                                </div>
                            </div>
                            
                            <!-- loading page -->
                            <div id="panelLoading2" style="overflow-x: hidden;overflow-y: auto;background: rgba(0, 0, 0, 0.8);position:absolute;top: 0;right: 0;bottom: 0;left: 0;z-index: 1050;overflow: hidden;outline: 0;color: white; display: none;">
                                <div style="position: absolute; width: 80px; right: 100px;" class="loading">
                                <div class="obj1"></div>
                                <div class="obj2"></div>
                                <div class="obj3"></div>
                                <div class="obj4"></div>
                                <div class="obj5"></div>
                                <div class="obj6"></div>
                                <div class="obj7"></div>
                                <div class="obj8"></div>
                                </div>
                            </div>
                            
                            <center>
                                <div class="alert mesFalseStock1 text-center ajoutHeader" role="alert" style="background-color: #F44336; width: 60%; display: none;">
                                    <small style="color: white;"><b>Veuillez cocher au moins un credit!</b></small>
                                </div> 
                            </center>
                            <center>
                                <div class="alert mesFalseStock2 text-center ajoutHeader" role="alert" style="background-color: #F44336; width: 60%; display: none;">
                                    <small style="color: white;"><b>Entrer au moins un quantité de credit!</b></small>
                                </div> 
                            </center>
                            
                        </div>

                        <!-- Modal footer -->
                        <div class="modal-footer">
                            <button type="button" class="btn btn-warning btn-sm prevS" style="display: none;">Précédent</button>
                            <button type="button" class="btn btn-primary btn-sm suivS"><b id="textSuivantStock">Suivant</b></button>
                        </div>

                    </div>
                </div>
            </div>
            <hr class="separator2">
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
        <script src="js/lobibox.js"></script>
        <script src="dataTable/js/jquery.dataTables.js"></script>
        <script src="dataTable/js/dataTables.bootstrap4.js"></script>
        <script src="js/sweetalert2.all.min.js"></script>
        <script src="js/anime.js"></script>
        <script>
            var numCli;
            var numClient;
            /* controle champ numero */
            $('.nom').on("keyup", function () {
                var nb = $('.nom').length;
                if (nb >= 1) {
                    $(this).val(($(this).val()).toUpperCase());
                }
            });
            
            $('#prenom').on("blur", function () {
                var str=document.ajout.prenom.value;
                var txt1=(str.substring(0,1)).toUpperCase();
                document.ajout.prenom.value="";
                var prenom=document.ajout.prenom.value;
                var str1=str;
                var x1=parseInt(str1.indexOf(" "));
                prenom=prenom+txt1+str1.substring(1,x1)+ " ";
                while(x1>0){
                    str1=str1.substring(x1+1,str1.length);
                    txt1=(str1.substring(0,1)).toUpperCase();
                    x1=parseInt(str1.indexOf(" "));
                    prenom=prenom+txt1+str1.substring(1,(str1.length));
                }
                document.ajout.prenom.value=prenom;
            });
            
            $('.tel').on("blur", function () {
                var phone = $(this).val();
                if (isNaN(phone) == false) {
                    var isa = phone.length;
                    if (isa == 10) {
                        var cs = phone.substring(0,3);
                        if (cs=="032" || cs=="033" || cs=="034" || cs=="039") {
                            $(this).val(phone.substring(0,3) +" "+ phone.substring(3,5) +" "+ phone.substring(5,8) +" "+ phone.substring(8,10));
                        } else {
                            $(this).val("");
                        }
                    } else {
                        $(this).val("");
                    }
                }
            });
            
            $('.tel').on("keyup", function(){
                var id = $(this).val();
                if(isNaN(id) == true){
                    var val = id.substring(1,1);
                    $(this).val(val);
                } else{
                  if(id.length > 10){
                    var val = id.substring(0,10);
                    $(this).val(val);
                  }
                }
            });
            
            var qteProdCom = new Array();
            var idProdCom = new Array();
            var colors = new Array();
            var prixProdCom = new Array();
            colors[1] = "#E91E63";
            colors[2] = "#880E4F";
            colors[3] = "#D32F2F";
            colors[4] = "#7B1FA2";
            colors[5] = "#6A1B9A";
            colors[6] = "#5E35B1";
            colors[7] = "#0D47A1";
            colors[8] = "#006064";
            colors[9] = "#2E7D32";
            colors[10] = "#455A64";
            $('.modalAjout').click(function(){
                var random = Math.floor((Math.random()*10)+1);
                var randomColorBg = colors[random];
                $('.ajoutHeader').css("background", randomColorBg);
            });
     
            btnDec = $('#btnDeconnexion');
            table1 = $('#mytable');
            spin = $('#panelLoading');
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
            
            state = false;
            $(document).ready(function(){
                var i;
                $('#mytable').dataTable({
                    "language": {"url": "dataTable/dataTables.french.lang"}
                });
                AfficheComande();
                $('.nom').val("");
                $(".prenom").val("");
                $(".adresse").val("");
                $(".tel").val("");
            });
            
            $('[data-toggle="collapse"]').click(function() {
                if (state == false) {
                    $('.box-body').toggle('slide', {direction: 'up'}, 900);
                    $('[data-toggle="collapse"] img').attr("src", "Image/up.png");
                    state = true;
                } else {
                    $('.box-body').toggle('slide', {direction: 'up'}, 900);
                    state = false;
                    $('[data-toggle="collapse"] img').attr("src", "Image/down.png");
                }
            });
            
            
             // ajax
            function AfficheComande() {
                var operation = "afficherCommande";
                $('#mytable tbody').on('click', 'a', function() {
                    numCli = $(this).text();
                    $.ajax({
                        async: false,
                        type: "POST",
                        url: "ListeCommande",
                        dataType: 'html',
                        data: {numClient: numCli, operation: operation},
                        success: function (data) {
                            $('#'+numCli).html(data);
                            suppMutliple();
                        },
                        error: function (error) {
                            console.log(error.responseText);
                        }
                    });
                });
            }
            
            var clickAjoutCommande = 0;
            var allChoose = new Array();
            var nomCli = $('.nom');
            var prenomCli = $('.prenom');
            var adresseCli = $('.adresse');
            var telCli = $('.tel');
            var btnSuivant = $('.btnSuivant');
            btnSuivant.click(function() {
                switch(clickAjoutCommande) {
                    case 0 : {
                        if (nomCli.val() == "" || adresseCli.val() == "") {
                            $('.mesFalse1').show();
                            anime({
                                targets: '.mesFalse1',
                                scale: [0,1],
                                opacity: [0,1],
                                duration: 800
                            });
                            setTimeout(function () {
                                $('.mesFalse1').toggle('slide', {direction: 'down'}, 600);
                            }, 3000);
                        } else {
                            nom = nomCli.val();
                            prenom = prenomCli.val();
                            adresse = adresseCli.val();
                            tel = telCli.val();
                            var operation = "verifierClient";
                            $.ajax({
                                async: false,
                                type: "POST",
                                url: "ListeCommande",
                                dataType: 'json',
                                data: {operation: operation, nom: nom, prenom: prenom, adresse: adresse, tel: tel},
                                success: function (data) {
                                    $('.numCom').text(data.num);
                                    numClient = data.num;
                                    $('.nomCom').text(data.nom);
                                    $('.prenomCom').text(data.prenom);
                                    $('.adresseCom').text(data.adresse);
                                    $('.telCom').text(data.tel);
                                    var message = data.prenom+' fait déjà partie de notre client';
                                    spin.show();
                                    setTimeout(function () {
                                        spin.hide();
                                        if (data.etat == "true") {
                                            Lobibox.notify('info', {
                                                size: 'mini',
                                                msg: message
                                            });
                                        } else {
                                            Lobibox.notify('success', {
                                                size: 'mini',
                                                msg: 'Un nouveau client vient d\'etre ajouté'
                                            });
                                        }
                                        $('.slide1').toggle('slide', {direction: 'left'}, 850);
                                        setTimeout(function () {
                                            $('.slide2').toggle('slide', {direction: 'right'}, 900);
                                            clickAjoutCommande++;
                                        }, 890);
                                    }, 2500);
                                },
                                error: function (error) {
                                    console.log(error.responseText);
                                }
                            });
                        }
                    } break;
                    
                    case 1: {
                        var i = 1;
                        $('.chooseProd input:checked').each(function(){
                            allChoose[i] = $(this).val();
                            $('.'+allChoose[i]).show();
                            i++;
                        });
                        if (allChoose.length == 0) {
                            $('.mesFalse2').show();
                            anime({
                                targets: '.mesFalse2',
                                scale: [0,1],
                                opacity: [0,1],
                                duration: 800
                            });
                            setTimeout(function () {
                                $('.mesFalse2').toggle('slide', {direction: 'down'}, 600);
                            }, 3000);   
                        } else {
                            spin.show();
                            setTimeout(function () {
                                spin.hide();
                                $('.slide2').toggle('slide', {direction: 'left'}, 850);
                                $('.ajout').animate({height: '450px'}, 600);
                                setTimeout(function () {
                                    $('.slide3').toggle('slide', {direction: 'right'}, 900);
                                    clickAjoutCommande++;
                                }, 890);
                                setTimeout(function () {
                                    $('.btnPrev').toggle('slide', {direction: 'right'}, 850);
                                }, 920);
                            }, 2500);
                        }
                    } break;
                    
                    case 2: {
                        var error = 0;
                        var champs = 0;
                        var champsVide = 0;
                        var success = 0;
                        var i = 0;
                        $('.ajoutQuantite table input').each(function() {
                            champs++;
                            if ($(this).val() != 0 || $(this).val() != "") {
                                var id = $(this).attr('id');
                                var qte = $(this).val();
                                var pu = $(this).attr('data-pu');
                                var operation = "verifProduit";
                                $.ajax({
                                    async: false,
                                    type: "POST",
                                    url: "ListeCommande",
                                    dataType: "json",
                                    data: {operation: operation, idProdCom: id, qteProdCom: qte},
                                    success: function (data) {
                                        if (data.Quantité_disponible == "true") {
                                            idProdCom[i] = id;
                                            qteProdCom[i] = qte;
                                            prixProdCom[i] = pu;
                                            i++; 
                                        } else {
                                            $('#'+id).css('border', '1px solid red');
                                            $('#'+id).addClass('animated tada');
                                            Swal.fire({
                                                position: 'top-end',
                                                type: 'warning',
                                                title: 'Stock insuffisant, veuillez resaisir la quantité',
                                                showConfirmButton: false,
                                                timer: 5500
                                            });
                                            error++;
                                        }
                                    },
                                    error: function (error) {
                                        Console.log(error.responseText);
                                    }
                                    
                                });
                            } else {
                                champsVide++;
                            }
                        }); 
                        if (champs == champsVide) {
                            $('.mesFalse3').show();
                            anime({
                                targets: '.mesFalse3',
                                scale: [0,1],
                                opacity: [0,1],
                                duration: 800
                            });
                            setTimeout(function () {
                                $('.mesFalse3').toggle('slide', {direction: 'down'}, 600);
                            }, 3000);
                        } else {
                            if (error == 0) {
                                var operation = "ajouterNouveauCommande";
                                var total = 0;
                                for (i=0; i<idProdCom.length; i++) {
                                    $('#bodyTabContenu').append(
                                        '<tr>'+
                                            '<td>'+idProdCom[i]+'</td>'+
                                            '<td>'+prixProdCom[i]+'</td>'+
                                            '<td>'+qteProdCom[i]+'</td>'+
                                            '<td>'+prixProdCom[i] * qteProdCom[i]+'</td>'+
                                        '</tr>'
                                    );
                                    total += prixProdCom[i] * qteProdCom[i];
                                    success++;
                                }
                                $('#textTotal').text(total);
                                
                                if (success == idProdCom.length) {
                                    spin.show();
                                    setTimeout(function () {
                                        spin.hide();
                                        $('.slide3').toggle('slide', {direction: 'left'}, 850);
                                        $('.ajout').animate({height: '450px'}, 600);
                                        setTimeout(function () {
                                            $('.slide4').toggle('slide', {direction: 'right'}, 900);
                                            clickAjoutCommande++;
                                            $('.btnSuivant').removeClass('btn-primary');
                                            $('.btnSuivant').addClass('btn-success');
                                            $('#nameBtnSuivant').text('Terminé');
                                        }, 890); 
                                    }, 2500);
                                }
                            }
                        }
                    } break;
                    
                    case 3: {
                        var operation = "ajouterNouveauCommande";
                        for (i=0; i<idProdCom.length; i++) {
                            $.ajax({
                               async: false,
                               type: "POST",
                               url: "ListeCommande",
                               dataType: "json",
                               data: {operation: operation, idProdCom: idProdCom[i], qteProdCom: qteProdCom[i], numClient: numClient},
                               success: function (data) {
                                   if (data.Etat == "success") {
                                        success++;
                                        let timerInterval
                                        Swal.fire({
                                          title: 'Veuillez patienter!',
                                          timer: 2000,
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
                                        setTimeout(function () {
                                            window.location.reload();
                                        }, 3000);
                                   } else {
                                       alert(data.Etat);
                                   }
                               },
                               error: function (error) {
                                   Console.log(error.responseText);
                               } 
                            });   
                        }
                    } 
                }
            });
            
            $('.btnPrev').click(function () {
                var i;
                if(clickAjoutCommande == 2) {
                    clickAjoutCommande--;
                    spin.show();
                    setTimeout(function () {
                        spin.hide();
                        $('.slide3').toggle('slide', {direction: 'right'}, 850);
                        setTimeout(function () {
                            $('.ajout').animate({height: '350.817px'}, 600);
                        }, 860);
                        setTimeout(function () {
                            $('.slide2').toggle('slide', {direction: 'left'}, 900);
                        }, 890);
                        setTimeout(function () {
                            $('.btnPrev').toggle('slide', {direction: 'down'}, 850);
                        }, 920);
                        for (i = 0; i<allChoose.length; i++) {
                            $('.'+allChoose[i]).hide();
                            $('.ajoutQuantite table input').each(function() {
                                $(this).val("");
                            });
                            allChoose.length = 0;
                        }
                    }, 2500);
                }
                
                if(clickAjoutCommande == 3) {
                    spin.show();
                    setTimeout(function () {
                        spin.hide();
                        $('.slide4').toggle('slide', {direction: 'right'}, 850);
                        $('.ajout').animate({height: '450px'}, 600);
                        setTimeout(function () {
                            $('.slide3').toggle('slide', {direction: 'left'}, 900);
                            $('#bodyTabContenu').html(" ");
                            idProdCom.length = 0;
                            $('.btnSuivant').removeClass('btn-success');
                            $('#nameBtnSuivant').text('Suivant');
                            $('.btnSuivant').addClass('btn-primary');
                            clickAjoutCommande--;
                        }, 890); 
                    }, 2500);
                }
            });
            
            
            var nbr = 0;
            var open = false;
            $('.nom').keyup(function () {
                var key = $(this).val();
                if (key.length > 0) {
                    var op = "indication";
                    $.ajax({
                        async: false,
                        type: "POST",
                        url: "ListeCommande",
                        dataType: 'json',
                        data: {operation : op, key: key},
                        success: function (data) {
                            $("#sugNomClient ul").html(data.html);
                            if (data.empty == "false") {
                                if (open == false) {
                                    $('#sugNomClient').toggle("slide", {direction: "up"});
                                    open = true;
                                }
                            } else {
                                if(open == true) {
                                    $('#sugNomClient').toggle("slide", {direction: "up"}, 400);
                                    open = false;
                                }
                            }
                        },
                        error: function (jqXHR) {
                            console.log(jqXHR.responseText);
                        }
                    });
                }
                else {
                    if(open == false){
                        $("#sugNomClient").toggle("slide",{direction:"up"});
                        open = true;
                    } else {
                        $("#sugNomClient").toggle("slide",{direction:"up"},400);
                        open = false;
                    }
                }
            });
            
            $(document).on('click','#sugNomClient ul li',function(){
                var nom = $(this).attr("data-nom");
                var prenom = $(this).attr("data-prenom");
                var adresse = $(this).attr("data-adresse");
                var tel = $(this).attr("data-tel");
                $('.nom').val(nom);
                $(".prenom").val(prenom);
                $(".adresse").val(adresse);
                $(".tel").val(tel);
                if(open == true){
                    $(this).addClass("animated pulse");
                    setTimeout(function(){
                        $("#sugNomClient").toggle("slide",{direction:"up"});
                        isSugOpen = false;
                    },800);
                }
            });
            
            function suppMutliple() {
                $('.suppmultiple > .supTous').click(function () {
                   var idT = $(this).attr('data-idT');
                   var date = $(this).attr('data-date');
                   Swal.fire({
                        title: 'Vous etes sur?',
                        text: "Voulez vous vraiment supprimer les commmandes du client N°"+numCli+" du date "+date+"",
                        type: 'warning',
                        showCancelButton: true,
                        confirmButtonColor: '#3085d6',
                        cancelButtonColor: '#d33',
                        confirmButtonText: 'Oui, Supprimer!',
                        cancelButtonText: 'Non!'
                      }).then((result) => {
                        if (result.value) {
                            var op = "supprimerCommandeDate";
                            $.ajax({
                                async: false,
                                type: "POST",
                                url: "ListeCommande",
                                dataType: 'json',
                                data: {operation: op, numClient: numCli, date: date}, 
                                success: function (data) {
                                    if(data.state == "true") {
                                        $('.'+idT).toggle('slide', {direction : 'left'}, 850);
                                        Swal.fire({
                                            position: 'top-end',
                                            type: 'success',
                                            title: 'Suppression commande commmandes du client N°'+numCli+' du date '+date+' réussie',
                                            showConfirmButton: false,
                                            timer: 1500
                                        });
                                    }
                                },
                                error: function (error) {
                                    console.log(error.getResponseText);
                                }
                            });
                        }
                      })
                });
            }
            
            
            // ajout stock
            var clickAjoutStock = 0;
            var allChooseStock = new Array();
            var champsS = 0;
            var champVideS = 0;
            var idProdComStock = new Array();
            var qteBaseStock = new Array();
            var qteSaisiStock = new Array();
            var successS = 0;
            $('.suivS').click(function () {
                switch(clickAjoutStock) {
                    case 0: {
                        var i = 1;
                        $('.chooseProdStock input:checked').each(function () {
                            allChooseStock[i] = $(this).val();
                            $('.'+allChooseStock[i]).show();
                            i++;
                        });
                        if (allChooseStock.length == 0) {
                            $('.mesFalseStock1').show();
                            anime({
                                targets: '.mesFalseStock1',
                                scale: [0,1],
                                opacity: [0,1],
                                duration: 800
                            });
                            setTimeout(function () {
                                $('.mesFalseStock1').toggle('slide', {direction: 'down'}, 600);
                            }, 3000); 
                        } else {
                            $('#panelLoading2').show();
                            setTimeout(function () {
                                $('#panelLoading2').hide();
                                $('.slideStock1').toggle('slide', {direction: 'left'}, 850);
                                $('.ajoutStock').animate({height: '440px'}, 600);
                                setTimeout(function () {
                                    $('.slideStock2').toggle('slide', {direction: 'right'}, 900);
                                    clickAjoutStock++;
                                }, 890);
                                setTimeout(function () {
                                    $('.prevS').toggle('slide', {direction: 'right'}, 850);
                                }, 920);
                            }, 2500);
                        }
                    } break;
                    
                    case 1: {
                        var i = 0;
                        $('.ajoutQuantiteStock table input').each(function() {
                            champsS++;
                            if ($(this).val() != 0 || $(this).val() != "") {
                                var code = $(this).attr('id');
                                var qteS = $(this).attr('data-qteS');
                                var newQte = $(this).val();
                                idProdComStock[i] = code;
                                qteBaseStock[i] = qteS;
                                qteSaisiStock[i] = newQte;
                                i++;
                            } else {
                                champVideS++;
                            }
                        });
                        
                        if (champsS == champVideS) {
                            $('.mesFalseStock2').show();
                            anime({
                                targets: '.mesFalseStock2',
                                scale: [0,1],
                                opacity: [0,1],
                                duration: 800
                            });
                            setTimeout(function () {
                                $('.mesFalseStock2').toggle('slide', {direction: 'down'}, 600);
                            }, 3000);
                            
                        } else {
                            var somme = 0;
                            for (i=0; i<idProdComStock.length; i++) {
                                $("#bodyTabContenuStock").append(
                                    '<tr>'+
                                        '<td>'+idProdComStock[i]+'</td>'+
                                        '<td id="qteStock">'+qteBaseStock[i]+'</td>'+
                                        '<td id="qteSaisi">'+qteSaisiStock[i]+'</td>'+
                                        '<td id="newQte">'+parseInt(parseInt(qteBaseStock[i]) + parseInt(qteSaisiStock[i]))+'</td>'+
                                    '</tr>'
                                );
                                successS++;
                            }
                            if (successS == idProdComStock.length) {
                                $('#panelLoading2').show();
                                setTimeout(function () {
                                    $('#panelLoading2').hide();
                                    $('.slideStock2').toggle('slide', {direction: 'left'}, 850);
                                    setTimeout(function () {
                                        $('.slideStock3').toggle('slide', {direction: 'right'}, 870);
                                        $('.ajoutStock').animate({height: '400px'}, 600);
                                        $('.suivS').removeClass('btn-primary');
                                        $('.suivS').addClass('btn-success');
                                        $('#textSuivantStock').text('Terminé');
                                        clickAjoutStock++;
                                    }, 890);
                                }, 2500);
                            }
                        }
                    } break;
                    
                    case 2 : {
                        var operation = "updateStock";
                        for(i = 0; i<idProdComStock.length; i++) {
                            $.ajax({
                                async: false,
                                type: "POST",
                                url: "ListeCommande",
                                dataType: "json",
                                data: {operation: operation, idProdComStock: idProdComStock[i], qteSaisiProd: qteSaisiStock[i], qteProdStock: qteBaseStock[i]},
                                success: function (data) {
                                    if(data.success == "true") {
                                        let timerInterval
                                        Swal.fire({
                                          title: 'Veuillez patienter!',
                                          timer: 2000,
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
                                        })
                                        setTimeout(function () {
                                            window.location.reload();
                                        }, 2200);
                                    } else {
                                        alert(data.success);
                                    }
                                },
                                error: function (error) {
                                    console.log(error.responseText);
                                }
                            });
                        }
                    }
                }
            });
            
            $('.prevS').click(function () {
                var i = 0;
                if (clickAjoutStock == 1) {
                    clickAjoutStock--;
                    $('#panelLoading2').show();
                    setTimeout(function () {
                        $('#panelLoading2').hide();
                        $('.slideStock2').toggle('slide', {direction: 'right'}, 850);
                        setTimeout(function () {
                            $('.ajoutStock').animate({height: '300px'}, 600);
                        }, 860);
                        setTimeout(function () {
                            $('.slideStock1').toggle('slide', {direction: 'left'}, 900);
                        }, 870);
                        setTimeout(function () {
                            $('.prevS').toggle('slide', {direction: 'down'}, 850);
                        }, 920);
                        for (i = 0; i<allChooseStock.length; i++) {
                            $('.'+allChooseStock[i]).hide();
                            $('.ajoutQuantiteStock table input').each(function() {
                                $(this).val("");
                            });
                            allChooseStock.length = 0;
                        }
                    }, 2500);
                };
                
                if (clickAjoutStock == 2) {
                    clickAjoutStock--;
                    $('#panelLoading2').show();
                    setTimeout(function () {
                        $('#panelLoading2').hide();
                        $('.slideStock3').toggle('slide', {direction: 'right'}, 850);
                        $('.ajoutStock').animate({height: '440px'}, 600);
                        setTimeout(function () {
                            $('.slideStock2').toggle('slide', {direction: 'left'}, 900);
                            $('#bodyTabContenuStock').html(" ");
                            idProdComStock.length = 0;
                            $('.suivS').removeClass('btn-success');
                            $('#textSuivantStock').text('Suivant');
                            $('.suivS').addClass('btn-primary');
                        }, 890); 
                    }, 2500);
                }
            });
        </script>
    </body>
</html>
