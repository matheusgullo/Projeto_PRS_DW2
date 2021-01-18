<?php
	
$assunto =  'Avaliação página';
$destinario = 'matheusgullo1@hotmail.com';
$remetente =  utf8_decode($_POST['email']);
$corpo = "
Assunto: ".$_POST['assunto']."
Nome: ".$_POST['nome']." 
Nota: ".$_POST['radio']."
Sugestão: ".$_POST['sugestao']."
";

	mail($destinario, $assunto,  $corpo, $remetente);
	
	echo 'Seus dados foram enviados com sucesso!';
?>
