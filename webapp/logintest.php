<?php
						include_once('database.php');
						
						//Next-Version RealTime? Now just get the info of ScoreBoard
						if($stmt = mysqli_prepare($link, "SELECT ScoreBoard.WinningTeam as WinningTeam, ScoreBoard.TeamAFinalScore as TeamA, ScoreBoard.TeamBFinalScore as TeamB, ScoreBoard.TimeRemaining as TimeLeft 
							FROM ScoreBoard;")){
								mysqli_stmt_execute($stmt);
								$result=mysqli_stmt_get_result($stmt);
								$_SESSION['TeamA']=1;
								$_SESSION['TeamB']=1;
								$_SESSION['Name']='';
								
								while($row=mysqli_fetch_array($result, MYSQLI_ASSOC)){
									foreach($row as $key=>$value){
										if($key=='TeamA'||$key=='TeamB'){
											$_SESSION['$key']=0;
											$_SESSION['Name']=$value;
											echo "<a href='#!/".$value."'><div>$key&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp$value</div></a>";
										}
										
										else
										echo "<div>$key&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp$value</div>";
									}
								}
								
								mysqli_stmt_close($stmt);
						}
						
						if($_SESSION['TeamA']==0||$_SESSION['TeamB']==0){
							$name = $_SESSION['Name'];
							echo "<li id='$name'>
									<div class='box'>
										<div class='inner'>";
							//Team Info
							if($stmt = mysqli_prepare($link, "SELECT ShotScore, TargetHit, CurrentScore, NumOfPlayers 
								FROM Team WHERE Team.TeamName='$name';")){
								mysqli_stmt_execute($stmt);
								$result=mysqli_stmt_get_result($stmt);
								
								while($row=mysqli_fetch_array($result, MYSQLI_ASSOC){
									foreach($row as $key=>$value){
										echo "<div>$key&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp$value</div>";
									}
								}
								mysqli_stmt_close($stmt);
							}
							
							//Player Name
							
							
							echo "		</div>
									</div>
								</li>";
						}
						
					?>
					
					
					
					
					
	<li id="GameLobby">
	<div class="box">
		<div class="inner">
<a href="#" class="close" data-type="close"><span></span></a>
<h1>Game Lobby</h1>
			<div class="wrapper tabs">
				<div class="col1">
					<h2><strong>Game Name</strong></h2>
					<ul class="nav">
									<?php
									
										//echo "test";
										$query = "select ScoreBoard.GameName from ScoreBoard";
										$result = mysqli_query($link, $query)
										or die("Query Failed: ".mysql_error());
										$num = mysqli_num_rows($result);
										// printing results in HTML

										while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
										{
											foreach ($line as $key=>$col_value)
											{
												echo "<li><a href='#'.'$col_value'><span></span>$col_value</a></li>";
											}
										} 

										// free resultset
										mysqli_free_result($result);

										// closing connection
										mysqli_close($link);
									?>
					</ul>
				</div>
				<div class="col2 left1">
					<?php
						include_once('database.php');
						
						$query="SELECT ScoreBoard.TeamName as WinningTeam, ScoreBoard.TeamAFinalScore as TeamA, ScoreBoard.TeamBFinalScore as TeamB, ScoreBoard.TimeRemaining as TimeLeft 
							FROM ScoreBoard WHERE TeamName='Game2';";
						$result = mysqli($link,$query)
						or die("Query Failed: ".mysqli_error());
						$num = mysqli_num_rows($result);
						// printing results in HTML
						
						while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
						{
							foreach ($line as $key=>$col_value)
							{
								echo "<div class='tab_content' id=''><div class='wrapper'>";
								echo "<li><a href='#'.'$col_value'><span></span>$col_value</a></li>";
								echo "</div></div>";
							}
						} 

						// free resultset
						mysqli_free_result($result);
						mysqli_close($link);
						
						echo "0";
						
					?>
				</div>
			</div>
		</div>
	</div>
</li>



<h1>Game Lobby</h1>
			<div class="wrapper">
				<div>
					<h2><strong>Game Name</strong></h2>
						<?php
							include_once("database.php");
										
							//echo "test";
							$query = "select ScoreBoard.GameName from ScoreBoard";
							$result = mysqli_query($link, $query)
							or die("Query Failed: ".mysql_error());
							$num = mysqli_num_rows($result);
							// printing results in HTML

							while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
							{
								foreach ($line as $key=>$col_value)
								{
									echo "<a href='#!/'.'$col_value'><span></span>$col_value</a></li>";
								}
							} 

							// free resultset
							mysqli_free_result($result);

							// closing connection
							mysqli_close($link);
						?>
				</div>
				<div class="col2 left1">
					<?php
						include_once('database.php');
						
						$query="SELECT ScoreBoard.TeamName as WinningTeam, ScoreBoard.TeamAFinalScore as TeamA, ScoreBoard.TeamBFinalScore as TeamB, ScoreBoard.TimeRemaining as TimeLeft 
							FROM ScoreBoard WHERE TeamName='Game2';";
						$result = mysqli($link,$query)
						or die("Query Failed: ".mysqli_error());
						$num = mysqli_num_rows($result);
						// printing results in HTML
						
						while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
						{
							foreach ($line as $key=>$col_value)
							{
								echo "<div class='tab_content' id=''><div class='wrapper'>";
								echo "<li><a href='#'.'$col_value'><span></span>$col_value</a></li>";
								echo "</div></div>";
							}
						} 

						// free resultset
						mysqli_free_result($result);
						mysqli_close($link);
						
						echo "0";
						
					?>
				</div>
			</div>
			
			
			<div class="box">
	<div class="inner">
		<a href="#" class="close" data-type="close"><span></span></a>
<h1>Game Lobby</h1>
<div class="wrapper">
	<h2 align=center>Game Name</h2>
	<form action="#!/gameinfo" method="POST" align=center>
<?php
	include_once("database.php");
										
	//echo "test";
	$query = "select ScoreBoard.GameName from ScoreBoard";
	$stmt = mysqli_stmt_init($link);
	
	if(mysqli_stmt_prepare($stmt,$query)){
		mysqli_stmt_execute($stmt);

		while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
		{
			foreach ($line as $key=>$value)
			{
				echo "<p id='$value' name='$value'><span></span>$value<input type='submit' value='Details'></input></p>";
			}
		} 

		// closing connection
		mysqli_stmt_close($stmt);
	}
?>
	</form>
</div>
		</div>
	</div>