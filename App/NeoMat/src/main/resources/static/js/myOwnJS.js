function showRegisterSection() {
	document.getElementById("loginSection").style.display = "none";
	document.getElementById("registerSection").style.display = "block";
}

function showLoginSection() {
	document.getElementById("registerSection").style.display = "none";
	document.getElementById("loginSection").style.display = "block";
}

function buildingDeploy(comp) {
	var original = comp.src;
	var e = comp.id;
	document.getElementById('selectorImgChosen').src = original;
	switch (e) {
		case "selectorImg1":
			document.getElementById("selectorChosen1").style.display = "block";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg2":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "block";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg3":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "block";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg4":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "block";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg5":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "block";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg6":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "block";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg7":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "block";
			document.getElementById("selectorChosen8").style.display = "none";
			break;
		case "selectorImg8":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "block";
			break;
	}
}

function researchingDeploy(comp) {
	var original = comp.src;
	var e = comp.id;
	document.getElementById('selectorImgChosen').src = original;
	switch (e) {
		case "selectorImg1":
			document.getElementById("selectorChosen1").style.display = "block";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			break;
		case "selectorImg2":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "block";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			break;
		case "selectorImg3":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "block";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			break;
		case "selectorImg4":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "block";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			break;
		case "selectorImg5":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "block";
			document.getElementById("selectorChosen6").style.display = "none";
			break;
		case "selectorImg6":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "block";
			break;
	}
}

function troupDeploy(comp) {
	var original = comp.src;
	var e = comp.id;
	document.getElementById('selectorImgChosen').src = original;
	switch (e) {
		case "selectorImg1":
			document.getElementById("selectorChosen1").style.display = "block";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
		case "selectorImg2":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "block";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
		case "selectorImg3":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "block";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
		case "selectorImg4":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "block";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
		case "selectorImg5":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "block";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
		case "selectorImg6":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "block";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
		case "selectorImg7":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "block";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg8":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "block";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg9":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "block";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg10":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "block";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg11":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "block";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg12":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "block";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg13":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "block";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg14":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "block";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg15":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "block";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg16":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "block";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg17":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "block";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg18":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "block";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg19":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "block";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg20":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "block";
			document.getElementById("selectorChosen21").style.display = "none";
			break;
			case "selectorImg21":
			document.getElementById("selectorChosen1").style.display = "none";
			document.getElementById("selectorChosen2").style.display = "none";
			document.getElementById("selectorChosen3").style.display = "none";
			document.getElementById("selectorChosen4").style.display = "none";
			document.getElementById("selectorChosen5").style.display = "none";
			document.getElementById("selectorChosen6").style.display = "none";
			document.getElementById("selectorChosen7").style.display = "none";
			document.getElementById("selectorChosen8").style.display = "none";
			document.getElementById("selectorChosen9").style.display = "none";
			document.getElementById("selectorChosen10").style.display = "none";
			document.getElementById("selectorChosen11").style.display = "none";
			document.getElementById("selectorChosen12").style.display = "none";
			document.getElementById("selectorChosen13").style.display = "none";
			document.getElementById("selectorChosen14").style.display = "none";
			document.getElementById("selectorChosen15").style.display = "none";
			document.getElementById("selectorChosen16").style.display = "none";
			document.getElementById("selectorChosen17").style.display = "none";
			document.getElementById("selectorChosen18").style.display = "none";
			document.getElementById("selectorChosen19").style.display = "none";
			document.getElementById("selectorChosen20").style.display = "none";
			document.getElementById("selectorChosen21").style.display = "block";
			break;
	}

}

function changeLocation(comp) {
	var loc = comp.value;
	var locType = comp.id;
	var con = document.getElementById('continent');
	var cou = document.getElementById('country');
	var reg = document.getElementById('region');
	if (locType.includes("Continent")) {
		con.innerHTML = loc;
	}
	if (locType.includes("Country")) {
		cou.innerHTML = loc;
	}
	if (locType.includes("Region")) {
		reg.innerHTML = loc;
	}

}

function showGameSection() {
	document.getElementById("researchSection").style.display = "none";
	document.getElementById("buildingSection").style.display = "none";
	document.getElementById("troupSection").style.display = "none";
	document.getElementById("gameSection").style.display = "block";
}

function showResearchesSection() {
	document.getElementById("gameSection").style.display = "none";
	document.getElementById("troupSection").style.display = "none";
	document.getElementById("buildingSection").style.display = "none";
	document.getElementById("researchSection").style.display = "block";
}

function showBuildingsSection() {
	document.getElementById("gameSection").style.display = "none";
	document.getElementById("troupSection").style.display = "none";
	document.getElementById("researchSection").style.display = "none";
	document.getElementById("buildingSection").style.display = "block";
}

function showTroupsSection() {
	document.getElementById("gameSection").style.display = "none";
	document.getElementById("buildingSection").style.display = "none";
	document.getElementById("researchSection").style.display = "none";
	document.getElementById("troupSection").style.display = "block";
}