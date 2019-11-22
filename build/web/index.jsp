<%-- 
    Document   : index
    Created on : 2 juin 2019, 11:39:24
    Author     : Gerson Elvestino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Fahana | Bienvenue</title>
        <link rel="icon" href="Image/E-fahana.png">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/w3.css">
        <link rel="stylesheet" type="text/css" href="css/loading.css">
    </head>
    <body>
        <section class="header">
            <video class="video" autoplay loop muted plays-inline>
                <source src="Videos/1.mp4" type="video/mp4">
            </video>             
        </section>
        <div>
        <image src="Image/E-fahana.png" style="position: absolute; top: 80px;">
            <div class="container">
                <div class="jumbotron" style="position: absolute; top: 70px; background-color: rgba(0,0,0,0.6); box-shadow: 0 0 50px rgba(0,0,0,1); margin-left: 780px; width: 430px; height: 540px; display: none;" id="slide">
                    <div class="container">
                        <center>
                            <h1 class="display-6" style="color: #BDBDBD;">B I E N V E N U E</h1>
                            <small class="form-text text-muted"><b>★ ★ Connectez-vous à votre compte ★ ★</b></small>   
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Nom d'utilisateur</label>
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text"><image src="Image/util.png" width="20" height="20"></div>
                                        </div>
                                        <input type="text" id="util" class="form-control" id="inlineFormInputGroupUsername" placeholder="Nom d'utilisateur">
                                    </div>
                                    <small class="form-text text-muted">Chaque employer a son propre utilisateur</small>
                                </div>
                                <div class="form-group">
                                  <label for="exampleInputPassword1">Mot de passe</label>
                                  <div class="input-group">
                                      <div class="input-group-prepend">
                                          <div class="input-group-text"><image src="Image/pass.png" width="20" height="20"></div>
                                      </div>
                                      <input type="password" id="mdp" class="form-control" id="inlineFormInputGroupUsername" placeholder="Mot de Passe">
                                  </div>
                                </div>
                                <div class="form-group form-check">
                                  <input type="checkbox" class="form-check-input" id="souvenir"style="margin-left: 170px;">
                                  <label class="form-check-label" for="exampleCheck1" style="margin-left: 190px;"><small>Se souvenir de moi<small></label>
                                </div>
                                <button type="button" class="btn btn-outline-light" id="btnCon" style="margin-left: 190px;">Se connecter<image id="suiv" src="Image/right.png" width="18" heigth="18" style="margin-left: 5px; display: none;"></button></br>
                                <div class="alert alert-danger" role="alert" id="mesDanger" style="display: none; margin-top: 10px; background-color: #F44336; border: 1px solid #F44336; height: 50px;">
                                    <h6 style="color: white; font-size: 1.2em"><b>Veuillez remplir tous les champs!</b></h6>
                                </div>
                                <div class="alert alert-danger" role="alert" id="mesFalse" style="display: none; margin-top: 10px; background-color: #F44336; border: 1px solid #F44336; height: 50px;">
                                    <h6 style="color: white; font-size: 1.2em"><b>Utilisateur ou mot de passe incorrecte!</b></h6>
                                </div>
                                <hr class="my-4">
                                <a href="#" style="margin-right: 150px; color: white;">Mot de passe oublié</a>
                                <a href="#" style="color: white;">Inscription</a>      
                        </center>
                        <div style="margin-left: 200px;">
                            <image src='Image/facebook.png' width='30' heigth='30'>
                            <image src='Image/twitter.png' width='30' heigth='30'>
                            <image src='Image/mail.png' width='30' heigth='30'>
                            <image src='Image/youtube.png' width='30' heigth='30'>
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
            </div>
        </div>
        <script src="js/jquery.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script>
            slide = $('#slide');
            btn = $('#btnCon');
            panel = $('#panelLoading');
            util = $('#util');
            mdp = $('#mdp');
            mesDanger = $('#mesDanger');
            mesFalse = $('#mesFalse');
            btnSuiv = $('#suiv');
            
            $(document).ready(function(){
               function affiche() {
                   slide.toggle('fade', {direction: 'left'}, 4000);
                   util.val("");
                   mdp.val("");
               };
               affiche();
            
               btn.on('mouseover', function(){
                   btnSuiv.show(400);
               });
               btn.on('mouseleave', function(){
                   btnSuiv.hide(400);
               });
            });
            
            var c = 0;
            btn.click(function() {
                if(util.val() == "" || mdp.val() == "") {
                    if (c == 0) {
                        slide.animate({height:"590px"}, 0); 
                        mesDanger.toggle('fade',  {direction: 'left'}, 1000);
                        mesFalse.hide();
                        c++;
                    } else {
                        mesDanger.hide();
                        mesFalse.hide();
                        mesDanger.toggle("shake", 250);
                    }
                } else {
                    panel.toggle('fade', 1000);
                    utilisateur = util.val();
                    password = mdp.val();
                    
                    // ajax
                    $.ajax({
                        async: false,
                        type: "POST",
                        url: "Login",
                        dataType: 'html',
                        data: {utilisateur: utilisateur, password: password},
                        success: function (result) {
                            setTimeout(function(){
                                if (result == "false") {
                                    panel.toggle('fade', 1000);
                                    util.val("");
                                    mdp.val("");
                                    if (c == 0) {
                                        slide.animate({height:"590px"}, 0); 
                                        mesFalse.toggle('shake',  {direction: 'left'}, 250);
                                        mesDanger.hide();
                                        c++;
                                    } else {
                                        mesFalse.hide();
                                        mesDanger.hide();
                                        mesFalse.toggle("shake", 250);
                                    }
                                } else {
                                    window.location.href = "Menu";
                                }    
                            }, 2000);
                        },
                        error: function (errorThrown) {
                            alert(errorThrown);
                        }
                    });
                }
            });
        </script>
    </body>
</html>
