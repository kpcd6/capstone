<!DOCTYPE html>
<html lang="en">
<head>
	<title></title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
		<script type="text/javascript" src="js/jquery-1.6.js" ></script>
		<script type="text/javascript" src="js/cufon-yui.js"></script>
		<script type="text/javascript" src="js/cufon-replace.js"></script>
		<script type="text/javascript" src="js/script.js" ></script>
		<script type="text/javascript" src="js/pages.js"></script>
		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
		<script type="text/javascript" src="js/tabs.js"></script>
</head>
<body id="page">
	<div class="extra">
		<div class="main">
			<div class="content_box">
				<!-- header -->
				<header>
					<h1><a href="index.html" id="logo"></a></h1>
					<nav>
						<ul id="menu">
							<li><a href="#!/Home"><strong>Home</strong></a></li>
							<li><a href="#!/Intro"><strong>Intro</strong></a></li>
							<li><a href="#!/GameRules"><strong>Rules</strong></a></li>
							<li><a href="#!/Videos"><strong>Videos</strong></a></li>
							<li><a href="#!/Gallery"><strong>Gallery</strong></a></li>
							<li><a href="#!/Contact"><strong>Contact</strong></a></li>
							<li><a href="#!/AboutUs"><strong>About Us</strong></a></li>
							<li><a href="#!/GameLobby"><strong>Game Lobby</strong></a></li>
							<li><a href="#!/Register"><strong>Register/Login</strong></a></li>
						</ul>
					</nav>
				</header>
				
				<article id="content">
					<ul>
					
					<?PHP
					session_start();
					include "database.php";
					?>
						<li id="Home">
							<div class="box">
								<div class="inner">
									<a href="#" class="close" data-type="close"><span></span></a>
									<div class="wrapper bot1">
										<div class="col1">
											<h2>Brief View of the Project</h2>
											<figure><img src="img/uav.jpg" alt="" class="bot1"></figure>
											<p class="bot1">The purpose of this project is to create a scalable game in which teams of players could compete against each other using multirotors equipped with IR(infrared) optics and sensors. </p>
										</div>
										<div class="col1 left1">
											<h2>The Latest Work</h2>
											<div class="warpper">
												<span class="date"><strong>17</strong><span>Sept</span></span>
												<div class="col2">
													<p class="bot2"><strong>Agenda Today</strong></p>
													<p class="bot1">Figure out setting up the database for java.</p>
													<p class="bot1">Complete the rest of web app GUI</p>
													<p class="bot1">Talk about the revision of our document last semester</p>
												</div>
											</div>
											<div class="wrapper">
												<span class="date"><strong>8</strong><span>Sept</span></span>
												<div class="col2">
													<p class="bot2"><strong>Progress Today</strong></p>
													<p class="bot1">Database Triggers with test data</p>
													<p class="bot1">Connext Database to Native app</p>
													<p class="bot1">Native app GUI</p>
												</div>
											</div>
											<a href="#!/More_Info" class="button"><span></span><strong>More&nbsp&nbsp&nbsp&nbsp&nbsp&nbspInformation</strong></a>
										</div>
									</div>
								</div>
							</div>
						</li>
						<li id="Intro">
							<div class="box">
								<div class="inner">
									<a href="#" class="close" data-type="close"><span></span></a>
									<h1>Sorry, Temporarily Open</h1>
									<h2 center>Still in Progress 1</h2>
								</div>
							</div>
						</li>
						<li id="GameRules">
							<div class="box">
								<div class="inner">
									<a href="#" class="close" data-type="close"><span></span></a>
									<div class="">
										<div class="">
											<h2>General</h2>
											<ul class="">
												<li><a href="#">Two equal teams of Defense and Offense</a></li>
												<li><a href="#">Each round consists of two turns</a></li>
												<li><a href="#">Each turn lasts 3 minutes.</a></li>
												<li><a href="#">Drones are equipped with IR sensor and IR optics/emitters</a></li>
												<li><a href="#">Drones are equipped with a LED to indicate if offense (red) or defense (green)</a></li>
												<li><a href="#">Drones are equipped with a LED to indicate if deactivated (orange)</a></li>
												<li><a href="#">Targets are equipped with IR sensors and a LED to indicate active (on) or inactive (off)</a></li>
												<li><a href="#">At the end of X rounds, the team with the most points wins.</a></li>
											</ul>
										</div>
										<div class="">
											<h2>Defense</h2>
											<ul class="">
												<li><a href="#">Must protect active targets from offense</a></li>
												<li><a href="#">Can deactivate offensive drone by hitting them with IR</a></li>
												<li><a href="#">Defensive drones have a cooldown of 5 seconds per IR shot. 25 IR shots per turn</a></li>
												<li><a href="#">If hit by an offensive drone, a 5 second cooldown will be added to the defensive drone’s IR cooldown</a></li>
												<li><a href="#">Must never cross the half-line into the offensive territory</a></li>
												<li><a href="#">If the half-line is crossed, that defensive drone is deactivated for the entire turn</a></li>
											</ul>
										</div>
										<div class="">
											<h2>Offense</h2>
											<ul class="">
												<li><a href="#">Must hit active targets with IR to be awarded 1 point</a></li>
												<li><a href="#">Can increase the Defense’s IR cooldown by hitting shooting them</a></li>
												<li><a href="#">If deactivated, the offensive drone must cross the halfway line and go into the offensive territory for 10 seconds before being reactivated</a></li>
												<li><a href="#">If deactivated, the offensive drone cannot shoot, and cannot be further deactivated</a></li>
												<li><a href="#">Offensive drones can be deactivated a total of 2 times before it is deactivated for the entire round</a></li>
												<li><a href="#">Offensive drones have a cooldown of 8 seconds per IR shot.  20 IR shots per turn</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</li>
						<li id="Videos">
							<div class="box">
								<div class="inner">
									<a href="#" class="close" data-type="close"><span></span></a>
									<iframe width="560" height="315" src="//www.youtube.com/embed/Kc7ZeMCV8K0" frameborder="0" allowfullscreen></iframe>
									<p>Test Video</p>
									<p>Test Database Here<p>
									<?php									
										//echo "test";
										
										$query = "select * from ScoreBoard";
										$result = mysqli_query($link, $query)
										or die("Query Failed: ".mysql_error());
										$num = mysqli_num_rows($result);
										echo '</br>'."num = ".$num.'</br>';
										// printing results in HTML
										
										echo "<table>";

										while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
										{
											print "<tr>";

											foreach ($line as $col_value)
										{	
											print "<td>$col_value</td>";
										}
										
											print "</tr>";  
										}  

										print "</table>";

										// free resultset
										mysqli_free_result($result);

										// closing connection
		//								mysqli_close($link);
										
										print "<p>Test Succeed</p>"
									?>
								</div>
							</div>
						</li>
						<li id="Gallery">
							<div class="box">
								<div class="inner">
									<a href="#" class="close" data-type="close"><span></span></a>
									<h1>Sorry, Temporarily Open</h1>
									<h2 center>Still in Progress 2</h2>
								</div>
							</div>
						</li>
						<li id="Contact">
							<div class="box">
								<div class="inner">
									<a href="#" class="close" data-type="close"><span></span></a>
									<h1>Sorry, Temporarily Open</h1>
									<h2 center>Still in Progress 3</h2>
								</div>
							</div>
						</li>
						<li id="AboutUs">
							<div class="box">
								<div class="inner">
									<a href="#" calss="close" data-type="close"><span></span></a>
									<div class="wrapper tabs">
										<div class="col1">
											<h2><strong>Team Members</strong></h2>
											<ul class="nav">
												<li><a href="#Harry" class='button'><span></span><strong>Harry</strong></a></li>
												<li><a href="#Ju" class='button'><span></span><strong>Chen Ju</strong></a></li>
												<li><a href="#Xu" class='button'><span></span><strong>Chen Xu</strong></a></li>
												<li><a href="#Cody" class='button'><span></span><strong>Cody Hicks</strong></a></li>
												<li><a href="#Krit" class='button'><span></span><strong>Krit Pattamadit</strong></a></li>
												<li><a href="#Tianyu" class='button'><span></span><strong>Tianyu Zhang</strong></a></li>
											</ul>
										</div>
										<div class="col2 left1">
											<div class="tab_content" id="Harry">
											<h2>Harrison Nguyen</h2>
											<div class="wrapper">
											<p>I have a laid-back personality and am usually game for any ideas that are presented to me if they sound interesting.
											In a team-based environment, I do whatever it takes to get the task done in a timely manner. 
											My schedule for meeting outside of class is generally free after 2PM aside from the Senior Capstone I class.
											I have worked with teams in various courses during my academic career: 
											Database, 
											Animation, 
											Software Engineering. 
											In each of these courses my team did well and I feel that I pulled my weight for the project.
											A lot of my programming experience comes from the computer science classes at the University of Missouri �?Columbia.
											The language that I have the most experience in is C since most of the courses at Mizzou use C for teaching.
											I have some experience in creating sound effects using various audio production tools such as Ableton Live and Omnisphere.
											As for the project, I'm really flexible if someone has a good idea. </p>
											</div>
											</div>
											<div class="tab_content" id="Ju">
											<h2>Chen Ju</h2>
											<div class="wrapper">
											<p> I have some experience about designing programs.
											Usually I like doing something like a system analyst, but I do programming part too. 
											My most familiar language is Java, and I know C, C++, PHP, CSS, HTML, and MySQL as well. 
											I currently have two jobs. Firstly I am a teacher in a Chinese Language Training school, 
											which is called New Oriental. I am also an editor for a city government’s news webpage in China. 
											I have some business, finance background too. So, I think I am good at communicating and writing, and that’s why I like being a system analyst. 
											I don't have a specific idea for now, I think games, app, webpage all sound good to me. 
											Looking forward to working together with you.</p>
											</div>
											</div>
											<div class="tab_content" id="Xu">
											<h2>Chen Xu</h2>
											<div class="wrapper">
											<p>Test1</p>
											</div>
											</div>
											<div class="tab_content" id="Cody">
											<h2>Cody Hicks</h2>
											<div class="wrapper">
											<p>Test2</p>
											</div>
											</div>
											<div class="tab_content" id="Krit">
											<h2>Krit Pattamadit</h2>
											<div class="wrapper">
											<p>Test3</p>
											</div>
											</div>
											<div class="tab_content" id="Tianyu">
											<h2>Tianyu Zhang</h2>
											<div class="wrapper">
											<p>Test4</p>
											</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</li>
						<li id="More_Info">
							<div class="box">
								<div class="inner">
								<a href="#" class="close" data-type="close"><span></span></a>
									<h1>Test More Info</h1>
								</div>
							</div>
						</li>
						<li id="GameLobby">
								<?php 
									require('gamelobby.php');
								?>
						</li>
						<li id="Register">
							<div class="box">
								<div class="inner">
								<a href="#" class="close" data-type="close"><span></span></a>
								<?php 
								require('login.php');
								?>
								</div>
							</div>
						</li>
						<?php
							require('gameinfo.php');
						?>
					</ul>
				</article>			
			</div>
		</div>
		<div class="block"></div>
	</div>
	<div class="bg">
		<div class="main">
			<footer>
				<div class="cola">
					<a href="index.html" id="footer_logo"></a> Copyright 2013
				</div>
			</footer>
		</div>
	</div>
</body>
</html>	