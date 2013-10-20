<li id="gameinfo">
	<div class="box">
		<div class="inner">
			<a href="#" class="close" data-type="close"><span></span></a>
				<h1 id="info">Team Information</h1>
				<?php
				include_once("database.php");
				echo $id;
							
				$query = "SELECT TeamName, ShotScore, TargetHit, CurrentScore, NumOfPlayers FROM Team";
				echo "<div align=center><table>";
				if($stmt = mysqli_prepare($link, $query)){
				mysqli_stmt_execute($stmt);
				mysqli_stmt_bind_result($stmt, $name,$score,$hit,$current,$num);
		
				while(mysqli_stmt_fetch($stmt)){
					echo "<tr><td>$name</td><td>$score</td><td>$hit</td><td>$current</td><td>$num</td></tr>";
				}
		
				mysqli_stmt_close($stmt);
				}
				
				echo "<tr><td colspan='5' align=center><a href='#!/GameLobby' class='button'><span></span><strong>BACK</strong></td></tr>";
				echo "</table></div>";
				
				?>
		</div>
	</div>
</li>