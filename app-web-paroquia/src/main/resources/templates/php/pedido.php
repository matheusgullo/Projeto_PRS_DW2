<?php
	
$assunto =  'Pedido de oração';
$destinario = 'matheusgullo1@hotmail.com';
$remetente =  utf8_decode($_POST['email']);
$corpo = "
Assunto: ".$_POST['assunto']."
Nome: ".$_POST['nome']." 
E-mail: ".$_POST['email']."
Telefone: ".$_POST['telefone']."
Pedido de oração: ".$_POST['texto']." 
";

	mail($destinario, $assunto,  $corpo, $remetente);
	
	echo 'Seus dados foram enviados com sucesso!';
?>
