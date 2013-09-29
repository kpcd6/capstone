<?php									
										session_start();
										include_once 'database.php';
										//echo "test";
										
										$query = "select * from ScoreBoard";
										$result = mysqli_query($link, $query)
										or die("Query Failed: ".mysql_error());
										// printing results in HTML
										echo "<table>";

										while ($line = mysqli_fetch_array($result, MYSQLI_ASSOC))
										{
											print "<tr>";

											foreach ($line as $col_value)
										{	
											print "test";
											print "<td>$col_value</td>";
										}
										
											print "</tr>";  
										}  

										print "</table>";
										print "test";

										// free resultset
										mysqli_free_result($result);

										// closing connection
										mysqli_close($link);
										 ?>