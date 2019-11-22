<%-- 
    Document   : Client
    Created on : 24 juin 2019, 07:42:56
    Author     : Gerson Elvestino
--%>

<%@page import="Classe.Connexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Gestion.GestionClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <title>e-Fahana | Clients</title>
      <link rel="stylesheet" href="css/bootstrap.css">
      <link rel="stylesheet" href="css/AdminLTE.min.css">
      <link rel="stylesheet" href="css/_all-skins.min.css">
      <link rel="icon" href="Image/E-fahana.png">
      <link rel="stylesheet" href="css/home.css">
      <link rel="stylesheet" href="dataTable/css/dataTables.bootstrap4.css">
    </head>
    <script>
        function modifier(Num,Nom,Prenom,Adresse,Tel,ID){
            document.getElementById('idd').value=Num; 
            document.getElementById('identifiant').value=ID;
            document.getElementById('om').value=Nom;  
            document.getElementById('pre').value=Prenom; 
            document.getElementById('adr').value=Adresse;
            document.getElementById('tt').value=Tel;                       
        }
    </script>
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
                          <ul class="dropdown-menu" style="border: none; border-top: none;">
                            <li class="user-footer">
                                <div class="row">
                                    <div class="col">
                                        <a href="#" class="btn btn-default btn-sm">Profile</a>
                                    </div>
                                    <div class="col">
                                        <a href="#" style="margin-left: 50px;" class="btn btn-primary btn-sm">Deconnexion</a>
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
        <li class="treeview active">
            <a href="#">
              <i><img src="Image/data.png" width="20px" height="20px" style="margin-bottom: 5px;" class="mr-2"></i><span>Documents</span>
              <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
            </a>
            <ul class="treeview-menu">
                <li class="active"><a href="#"><i><img src="Image/point.png" width="8px" height="8px" style="margin-bottom: 3px;" class="mr-2"></i>Clients</a></li>
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
            <hr class="separator1">
            <h3 style="text-align: center;" class="display-4">Nos Clients</h3>
            <div class="container-fluid">
                <table id="mytable" class="table table-bordered table-striped table-hover">
                    <thead style="background-color: #3c8dbc; color: white;">
	                  <tr>
                            <th>Numero</th>
	                    <th>Nom</th>
	                    <th>Prenoms</th>
                            <th>Adresse</th>
                            <th>Telephone</th>              
                            <th>Options</th>
	                  </tr>
	            </thead>
  
                    <%   
                       try{
                           Connexion cnx = new Connexion();
                           GestionClient gcli = new GestionClient();
                           ResultSet rs;
                           rs = gcli.affichage(cnx); 
                           while (rs.next()){ %>
                           <tr>
                               <td><%=rs.getInt("NumClient")%></td>
                               <td><%=rs.getString("NomClient")%></td> 
                               <td><%=rs.getString("PrenomClient")%></td>
                               <td><%=rs.getString("AdresseClient")%></td> 
                               <td><%=rs.getString("TelClient")%></td> 
                               <td>
                                   <a onclick="modifier('<%=rs.getInt("NumClient")%>','<%=rs.getString("NomClient")%>','<%=rs.getString("PrenomClient")%>','<%=rs.getString("AdresseClient")%>','<%=rs.getString("TelClient")%>', '<%=rs.getInt("NumClient")%>')" class="btn btn-outline-warning btn-sm" data-toggle="modal" data-target="#myModal">Modifier</a>
                                   <a class="btn btn-outline-danger btn-sm" href="Client?action=suppr&Numero=<%=rs.getInt("NumClient")%>">supprimer</a>
                               </td>
                           </tr>
                    <%}
                        }
                         catch(Exception ex){
                              out.println(ex.toString());
                        }
                  %>               
                </table>
                
                <div class="modal fade" id="Ajout" tabindex="-1" role="dialog"  aria-hidden="true" style="display: none;">
                    <div class="modal-dialog modal-sm">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title" >NOUVEAU CLIENT</h4>
                                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            </div>
                            <form methode="get" action="Client">
                                <div class="modal-body">
                                    <p>Numero :
                                    <input type="text" name="Numero" class="form-control"></p>
                                    <p>Nom :
                                    <input type="text" name="Nom" class="form-control"></p>
                                    <p>Prenoms :
                                    <input type="text" name="Prenom" class="form-control"></p>
                                    <p>Adresse :
                                    <input type="text" name="Adresse" class="form-control"></p>
                                    <p>Téléphone :
                                    <input type="text" name="Tel" class="form-control"></p>   
                                </div>
                                <div class="modal-footer">
                                    <button  class="btn btn-primary" style="width: 100%" type="submit" name="action" value="save" >Ajouter</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog modal-sm">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title" id="myModalLabel">MODIFICATION</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            </div>
                            <form methode="get" action="Client">
                                <div class="modal-body">
                                    <p>ID :
                                    <input type="text" name="Numero" id="idd" class="form-control"></p>
                                    
                                    <p>Nom :
                                    <input type="text" name="Nom" id="om" class="form-control"></p>

                                    <p>Prenom :
                                    <input type="text" name="Prenom" id="pre" class="form-control"></p>

                                     <p>Adresse :
                                    <input type="text" name="Adresse" id="adr" class="form-control"></p>

                                    <p>Tel :
                                    <input type="text" name="Tel" id="tt" class="form-control"></p>
                                    
                                    <p style="display: none;">ID :
                                    <input type="text" name="id" id="identifiant" class="form-control"></p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">Annuler</button>
                                    <button class="btn btn-primary btn-sm"  type="submit" name="action" value="up" >Sauvegarder</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#Ajout" style="position: relative; border-radius: 50%; float: right; top: -100px">+</button>
            </div>
        </div>
    </div>
    <!-- ./wrapper -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/jquery.slimscroll.min.js"></script>
        <script src="js/fastclick.js"></script>
        <script src="js/adminlte.min.js"></script>
        <script src="js/demo.js"></script>
        <script src="dataTable/js/jquery.dataTables.js"></script>
        <script src="dataTable/js/dataTables.bootstrap4.js"></script>
        <script>
            $(document).ready(function(){
                $('#mytable').dataTable({
                    "language": {"url": "dataTable/dataTables.french.lang"}
                }); 
            });
        </script>
    </body>
</html>
