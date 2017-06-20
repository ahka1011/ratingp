<!-- Autor: Tolga Duman, Erstelldatum: 23.05.2017 -->

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>TeamRating-Portal</title>

    <meta name="author" content="Tolga Duman">
	<style>
		#logo{
			display: table-cell;
			text-align: center;
			vertical-align: middle;
			position: absolute;
			width: 120px;
			height: 120px;
			max-width: 100%;
		}
	</style>
		
		<!--Bootstrap, CSS-->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		
		<!--JavaScript, JQuery, Bootstrap-->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/scripts.js"></script>
	</head>
	
	
  <!-- BODY --> 	
  <body>
    <div class="container-fluid">
	<br>
	<div class="row">
		<div class="col-lg-12">
		 <!--HEADER-->
			<div class="row">
				<div class="col-lg-1">
				<p></p>
					<img id="logo" alt="HSKA IWI" src="https://ilias.hs-karlsruhe.de/Customizing/global/skin/hska/images/HeaderIcon.svg">
				</div>
				<div class="col-lg-9">
					<div class="page-header">
						<h1>
							TeamRating - Portal
							<div>
								<img alt="HSKA icon" src="https://www.iwi.hs-karlsruhe.de/intranet/images/hska-wii_rot/iwi_ci_logo25.png?usn=263662077">
							</div>
						</h1>
					</div>
				</div>
				<div class="col-lg-1">
					<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/" width="100px" height="100px">
				</div>
				<!--Abmelden-->
				<div class="col-lg-1">
					<script>
						function Logout(){
							if (window.confirm ("Wollen Sie sich wirklich abmelden?") == true){
								// TODO Logout durchführen
							}
						}
					</script>
					<span class="label label-default" style="font-size: 16px;">duto1013</span> 
					<button type="button" class="btn btn-default" onclick="Logout()">Abmelden</button>		
				</div>
			</div>
			
			<ul class="nav nav-tabs">
				<li><a href="#">Meine Kurse</a></li>
			</ul>
			<div class="row">
				<div class="col-lg-12">
					<h3 class="text-left">
						  Kurse
					</h3>
					<div class="row">
						<div class="col-lg-12" >
							<table class="table table-responsive">
								<tr>	
									<td>
										<label>AWP</label>
									</td>
									<td><button type="button" class="btn btn-default" disabled="disabled">
											Kurs beitreten
										</button>
										<button type="button" class="btn btn-default">
											Kursmitgliedschaft beenden
										</button>
										<button type="button" class="btn btn-default">
											Info
										</button>
									</td>
								</tr>
								<tr>
									<td>
										<label>EWI</label>
									</td>
									<td><button type="button" class="btn btn-default">
											Kurs beitreten
										</button>
										<button type="button" class="btn btn-default" disabled="disabled">
											Kursmitgliedschaft beenden
										</button>
										</button>
										<button type="button" class="btn btn-default">
											Info
										</button>
									</td>
								</tr>
								<tr>
									<td>
										<label>E-Business</label>
									</td>
									<td><button type="button" class="btn btn-default">
											Kurs beitreten
										</button>
										<button type="button" class="btn btn-default" disabled="disabled">
											Kursmitgliedschaft beenden
										</button>
										<button type="button" class="btn btn-default">
											Info
										</button>
									</td>
								</tr>
							</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>