<div class="box">
	<div class="inner">
		<a href="#" class="close" data-type="close"><span></span></a>
<h1>Game Lobby</h1>
<div class="wrapper">
	<h2 align=center>Game Name</h2>
	<form action="#!/gameinfo" method="POST" align=center>
<?php
	include_once("database.php");
	
	// need a search engine
	
	$query = "select  ScoreBoard.ScoreBoardID, ScoreBoard.GameName, ScoreBoard.WinningTeam from ScoreBoard";
	echo "<div align=center><table>";
	if($stmt = mysqli_prepare($link, $query)){
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $id, $game_name, $winning_team);
		
		while(mysqli_stmt_fetch($stmt)){
			echo "<tr><td><span></span>$game_name</td><td>$winning_team</td><td><input type='submit' value='Details' class='button' onclick='lobby($id)'></input></td></tr>";
		}
	
//		while($row=$mysqli_fetch_assoc()){
//			echo "<tr><td><span></span>$row[GameName]</td><td><input type='submit' value='Details' class='button' onclick='lobby($id)'></input></td></tr>";
//		}
		
		mysqli_stmt_close($stmt);
	}
	echo "</table></div>";
	
	//mysqli_close($link);
?>
	</form>
</div>
		</div>
	</div>
	
<?php
//	function lobby($id){
//		return $id;
//	}
?>