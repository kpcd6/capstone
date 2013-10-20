<?php
	   $db_server = "54.200.170.30";
       $userName = "cs4970sp13grp2";
       $password = "4vmYGtTQVw";
       $dbName = "cs4970sp13grp2";

       $scriptName = $_SERVER['SCRIPT_NAME'];

       // Open link with access to data
       $link = mysqli_connect($db_server, $userName, $password, $dbName)
                or die("Could not connect : " . mysqli_connect_error() );
?>