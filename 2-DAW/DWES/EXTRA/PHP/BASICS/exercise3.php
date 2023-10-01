<!-- Write a simple PHP browser detection script.

Sample Output : Your-User Agent is: Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36 -->
<?php
echo "Your User Agent is :" . $_SERVER ['HTTP_USER_AGENT'];
?>