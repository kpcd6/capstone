<h2 align=center>Register</h2>
<script>
//checks to make sure the user has entered in data into all text boxes
function checkSubmission2() {
	var username1 = document.getElementById('username1').value;
	var firstname = document.getElementById('firstname').value;
	var lastname  = document.getElementById('lastname').value;
	var password1 = document.getElementById('password1').value;
	var password2 = document.getElementById('password2').value;
	var email = document.getElementById('email').value;
	
	if(!username1||!password1||!password2||!firstname||!lastname||!email){
		alert("Please enter all the blanks!");
		return -1;
	}
	else{ return 1;}
}

</script>

<form action="#!/Register" method="POST" onsubmit="return checkSubmission2();">
<div align=center>
<table>
	<tr><td><label class="label">User Name: </td><td><input class="input" type="text" name="username1" id="username1" placeholder="username"></label></td></tr>
	<tr><td><label class="label">First Name: </td><td><input class="input" type="text" name="firstname" id="firstname" placeholder="firstname"></label></td></tr>
	<tr><td><label class="label">Last Name: </td><td><input class="input" type="text" name="lastname" id="lastname" placeholder="lastname"></label></td></tr>
	<tr><td><label class="label">Password: </td><td><input class="input" type="password" name="password1" id="password1"  placeholder="password"/></label></td></tr>
	<tr><td><label class="label">Confirm Password: </td><td><input class="input" type="password" name="password2" id="password2"  placeholder="password"/></label></td></tr>
	<tr><td><label class="label">E-mail: </td><td><input class="input" type="text" name="email" id="email"  placeholder="email"/></label></td></tr>
	<tr align=center><td colspan="2"><input type="submit" class="button" name="submit" value="Register"/></td></tr> 
</table>
</div>
</form>

<?php
	include_once("database.php");
	
	if (isset($_POST['username1'])&&isset($_POST['password1'])&&isset($_POST['password2'])&&isset($_POST['firstname'])&&isset($_POST['lastname'])&&isset($_POST['email'])){
	
		$username1 = $_POST['username1'];
		$password1 = $_POST['password1'];
		$password2 = $_POST['password2'];
		$firstname = $_POST['firstname'];
		$lastname = $_POST['lastname'];
		$email = $_POST['email'];
		
		//haven't hash for the test purpose
		if($password1!=$password2){
			echo "<strong>Please enter the same password!</strong>";
			return -1;
		}
	
		//check if username is already taken
		if($stmt = mysqli_prepare($link, "SELECT Authenticate.PlayerID From Authenticate WHERE PlayerUsername = ?;")){
			mysqli_stmt_bind_param($stmt,'s',$username1);
			mysqli_stmt_execute($stmt);
			
			//test ID should delete id=0
			mysqli_stmt_bind_result($stmt,$playerID);
			mysqli_stmt_fetch($stmt);	
			
		//	echo $playerID;
			
			if($playerID!=0){
				echo "<strong>Username has been taken! Please enter again!</strong>";
				return -1;
			}
			
			mysqli_stmt_close($stmt);
		}
	
		//Insert Info Into the Authenticate Table
		$stmt = mysqli_prepare($link, "INSERT INTO Authenticate (PlayerUsername,PlayerPassword) VALUES(?, ? );");
		mysqli_stmt_bind_param($stmt,'ss',$username1,$password1);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_close($stmt);
		
		//Insert info Into the Player table 0 for the initial
		$stmt = mysqli_prepare($link, "INSERT INTO Player (PlayerFirstName,PlayerLAstName,PlayerEmail,ScoreBoardID,TeamID,DroneID) VALUES(?, ?, ?, 0, 0, 0);");
		mysqli_stmt_bind_param($stmt,'sss',$firstname, $lastname, $email);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_close($stmt);
		
		echo "<strong>Register Success!</strong>";
	}
?>