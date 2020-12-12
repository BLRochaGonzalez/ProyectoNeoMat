function ck() {
console.log(document.getElementById("product"));
	var timeleft = document.getElementById("product").innerText;
	console.log(timeleft);
	var downloadTimer = setInterval(function() {
		if (timeleft <= 0) {
			clearInterval(downloadTimer);
			document.getElementById("timerContainer").innerHTML = "Finished";
		} else {
			console.log(timeleft);
			document.getElementById("timerContainer").innerHTML = timeleft + " seconds remaining";
		}
		timeleft -= 1;
	}, 1000);
}


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

function showTime() {
	myDate = new Date();
	hours = myDate.getHours();
	minutes = myDate.getMinutes();
	seconds = myDate.getSeconds();
	if (hours < 10) hours = 0 + hours;

	if (minutes < 10) minutes = "0" + minutes;

	if (seconds < 10) seconds = "0" + seconds;

	document.getElementById("clock").innerText = "Hora Servidor: " + hours + ":" + minutes + ":" + seconds;
	setTimeout("showTime()", 1000);
	
	if(sessionStorage.getItem('timer')!=null){
		ck();
	}
}

function checkPass() {
	console.log(document.getElementById("inputPassword4").value);
	console.log(document.getElementById("hiddenPass").innerText);
	if (document.getElementById("inputPassword4").value == document.getElementById("hiddenPass").innerText) {
		document.getElementById("bActualizar").disabled = false;
	}
}

function showTotalSection() {
	document.getElementById("userByPoints").style.display = "block";
	document.getElementById("userByBPoints").style.display = "none";
	document.getElementById("userByRPoints").style.display = "none";
	document.getElementById("userByTPoints").style.display = "none";
}

function showBuildingSection() {
	document.getElementById("userByPoints").style.display = "none";
	document.getElementById("userByBPoints").style.display = "block";
	document.getElementById("userByRPoints").style.display = "none";
	document.getElementById("userByTPoints").style.display = "none";
}

function showResearchSection() {
	document.getElementById("userByPoints").style.display = "none";
	document.getElementById("userByBPoints").style.display = "none";
	document.getElementById("userByRPoints").style.display = "block";
	document.getElementById("userByTPoints").style.display = "none";
}

function showTroupSection() {
	document.getElementById("userByPoints").style.display = "none";
	document.getElementById("userByBPoints").style.display = "none";
	document.getElementById("userByRPoints").style.display = "none";
	document.getElementById("userByTPoints").style.display = "block";
}

function asignarTropas(comp) {
	var id = comp.id;
	var q = comp.value * 1;
	var tot = document.getElementById("totTroups").innerText * 1;
	tot = tot + q;
	document.getElementById("totTroups").innerText = tot;
	console.log(q);
	console.log(tot * 1);
}

function showCont1() {
	document.getElementById("imgMap").src = "/assets/radar/1.png";
	document.getElementById("C1").style.display = "none";
	document.getElementById("C2").style.display = "none";
	document.getElementById("C3").style.display = "none";
	document.getElementById("C4").style.display = "none";
	document.getElementById("C5").style.display = "none";
	document.getElementById("T").style.display = "block";
	document.getElementById("P1").style.display = "block";
	document.getElementById("P2").style.display = "block";
	document.getElementById("P3").style.display = "block";
	document.getElementById("P4").style.display = "block";
	document.getElementById("P5").style.display = "block";
	document.getElementById("P6").style.display = "block";
	document.getElementById("P7").style.display = "block";
	document.getElementById("P8").style.display = "block";
	document.getElementById("P9").style.display = "block";
	document.getElementById("P10").style.display = "block";
	document.getElementById("P11").style.display = "none";
	document.getElementById("P12").style.display = "none";
	document.getElementById("P13").style.display = "none";
	document.getElementById("P14").style.display = "none";
	document.getElementById("P15").style.display = "none";
	document.getElementById("P16").style.display = "none";
	document.getElementById("P17").style.display = "none";
	document.getElementById("P18").style.display = "none";
	document.getElementById("P19").style.display = "none";
	document.getElementById("P20").style.display = "none";
	document.getElementById("P21").style.display = "none";
	document.getElementById("P22").style.display = "none";
	document.getElementById("P23").style.display = "none";
	document.getElementById("P24").style.display = "none";
	document.getElementById("P25").style.display = "none";
	document.getElementById("P26").style.display = "none";
	document.getElementById("P27").style.display = "none";
	document.getElementById("P28").style.display = "none";
	document.getElementById("P29").style.display = "none";
	document.getElementById("P30").style.display = "none";
	document.getElementById("P31").style.display = "none";
	document.getElementById("P32").style.display = "none";
	document.getElementById("P33").style.display = "none";
	document.getElementById("P34").style.display = "none";
	document.getElementById("P35").style.display = "none";
	document.getElementById("P36").style.display = "none";
	document.getElementById("P37").style.display = "none";
	document.getElementById("P38").style.display = "none";
	document.getElementById("P39").style.display = "none";
	document.getElementById("P40").style.display = "none";
	document.getElementById("P41").style.display = "none";
	document.getElementById("P42").style.display = "none";
	document.getElementById("P43").style.display = "none";
	document.getElementById("P44").style.display = "none";
	document.getElementById("P45").style.display = "none";
	document.getElementById("P46").style.display = "none";
	document.getElementById("P47").style.display = "none";
	document.getElementById("P48").style.display = "none";
	document.getElementById("P49").style.display = "none";
	document.getElementById("P50").style.display = "none";
}

function showCont2() {
	document.getElementById("imgMap").src = "/assets/radar/4.png";
	document.getElementById("C1").style.display = "none";
	document.getElementById("C2").style.display = "none";
	document.getElementById("C3").style.display = "none";
	document.getElementById("C4").style.display = "none";
	document.getElementById("C5").style.display = "none";
	document.getElementById("T").style.display = "block";
	document.getElementById("P1").style.display = "none";
	document.getElementById("P2").style.display = "none";
	document.getElementById("P3").style.display = "none";
	document.getElementById("P4").style.display = "none";
	document.getElementById("P5").style.display = "none";
	document.getElementById("P6").style.display = "none";
	document.getElementById("P7").style.display = "none";
	document.getElementById("P8").style.display = "none";
	document.getElementById("P9").style.display = "none";
	document.getElementById("P10").style.display = "none";
	document.getElementById("P11").style.display = "block";
	document.getElementById("P12").style.display = "block";
	document.getElementById("P13").style.display = "block";
	document.getElementById("P14").style.display = "block";
	document.getElementById("P15").style.display = "block";
	document.getElementById("P16").style.display = "block";
	document.getElementById("P17").style.display = "block";
	document.getElementById("P18").style.display = "block";
	document.getElementById("P19").style.display = "block";
	document.getElementById("P20").style.display = "block";
	document.getElementById("P21").style.display = "none";
	document.getElementById("P22").style.display = "none";
	document.getElementById("P23").style.display = "none";
	document.getElementById("P24").style.display = "none";
	document.getElementById("P25").style.display = "none";
	document.getElementById("P26").style.display = "none";
	document.getElementById("P27").style.display = "none";
	document.getElementById("P28").style.display = "none";
	document.getElementById("P29").style.display = "none";
	document.getElementById("P30").style.display = "none";
	document.getElementById("P31").style.display = "none";
	document.getElementById("P32").style.display = "none";
	document.getElementById("P33").style.display = "none";
	document.getElementById("P34").style.display = "none";
	document.getElementById("P35").style.display = "none";
	document.getElementById("P36").style.display = "none";
	document.getElementById("P37").style.display = "none";
	document.getElementById("P38").style.display = "none";
	document.getElementById("P39").style.display = "none";
	document.getElementById("P40").style.display = "none";
	document.getElementById("P41").style.display = "none";
	document.getElementById("P42").style.display = "none";
	document.getElementById("P43").style.display = "none";
	document.getElementById("P44").style.display = "none";
	document.getElementById("P45").style.display = "none";
	document.getElementById("P46").style.display = "none";
	document.getElementById("P47").style.display = "none";
	document.getElementById("P48").style.display = "none";
	document.getElementById("P49").style.display = "none";
	document.getElementById("P50").style.display = "none";
}

function showCont3() {
	document.getElementById("imgMap").src = "/assets/radar/2.png";
	document.getElementById("C1").style.display = "none";
	document.getElementById("C2").style.display = "none";
	document.getElementById("C3").style.display = "none";
	document.getElementById("C4").style.display = "none";
	document.getElementById("C5").style.display = "none";
	document.getElementById("T").style.display = "block";
	document.getElementById("P1").style.display = "none";
	document.getElementById("P2").style.display = "none";
	document.getElementById("P3").style.display = "none";
	document.getElementById("P4").style.display = "none";
	document.getElementById("P5").style.display = "none";
	document.getElementById("P6").style.display = "none";
	document.getElementById("P7").style.display = "none";
	document.getElementById("P8").style.display = "none";
	document.getElementById("P9").style.display = "none";
	document.getElementById("P10").style.display = "none";
	document.getElementById("P11").style.display = "none";
	document.getElementById("P12").style.display = "none";
	document.getElementById("P13").style.display = "none";
	document.getElementById("P14").style.display = "none";
	document.getElementById("P15").style.display = "none";
	document.getElementById("P16").style.display = "none";
	document.getElementById("P17").style.display = "none";
	document.getElementById("P18").style.display = "none";
	document.getElementById("P19").style.display = "none";
	document.getElementById("P20").style.display = "none";
	document.getElementById("P21").style.display = "block";
	document.getElementById("P22").style.display = "block";
	document.getElementById("P23").style.display = "block";
	document.getElementById("P24").style.display = "block";
	document.getElementById("P25").style.display = "block";
	document.getElementById("P26").style.display = "block";
	document.getElementById("P27").style.display = "block";
	document.getElementById("P28").style.display = "block";
	document.getElementById("P29").style.display = "block";
	document.getElementById("P30").style.display = "block";
	document.getElementById("P31").style.display = "none";
	document.getElementById("P32").style.display = "none";
	document.getElementById("P33").style.display = "none";
	document.getElementById("P34").style.display = "none";
	document.getElementById("P35").style.display = "none";
	document.getElementById("P36").style.display = "none";
	document.getElementById("P37").style.display = "none";
	document.getElementById("P38").style.display = "none";
	document.getElementById("P39").style.display = "none";
	document.getElementById("P40").style.display = "none";
	document.getElementById("P41").style.display = "none";
	document.getElementById("P42").style.display = "none";
	document.getElementById("P43").style.display = "none";
	document.getElementById("P44").style.display = "none";
	document.getElementById("P45").style.display = "none";
	document.getElementById("P46").style.display = "none";
	document.getElementById("P47").style.display = "none";
	document.getElementById("P48").style.display = "none";
	document.getElementById("P49").style.display = "none";
	document.getElementById("P50").style.display = "none";
}

function showCont4() {
	document.getElementById("imgMap").src = "/assets/radar/3.png";
	document.getElementById("C1").style.display = "none";
	document.getElementById("C2").style.display = "none";
	document.getElementById("C3").style.display = "none";
	document.getElementById("C4").style.display = "none";
	document.getElementById("C5").style.display = "none";
	document.getElementById("T").style.display = "block";
	document.getElementById("P1").style.display = "none";
	document.getElementById("P2").style.display = "none";
	document.getElementById("P3").style.display = "none";
	document.getElementById("P4").style.display = "none";
	document.getElementById("P5").style.display = "none";
	document.getElementById("P6").style.display = "none";
	document.getElementById("P7").style.display = "none";
	document.getElementById("P8").style.display = "none";
	document.getElementById("P9").style.display = "none";
	document.getElementById("P10").style.display = "none";
	document.getElementById("P11").style.display = "none";
	document.getElementById("P12").style.display = "none";
	document.getElementById("P13").style.display = "none";
	document.getElementById("P14").style.display = "none";
	document.getElementById("P15").style.display = "none";
	document.getElementById("P16").style.display = "none";
	document.getElementById("P17").style.display = "none";
	document.getElementById("P18").style.display = "none";
	document.getElementById("P19").style.display = "none";
	document.getElementById("P20").style.display = "none";
	document.getElementById("P21").style.display = "none";
	document.getElementById("P22").style.display = "none";
	document.getElementById("P23").style.display = "none";
	document.getElementById("P24").style.display = "none";
	document.getElementById("P25").style.display = "none";
	document.getElementById("P26").style.display = "none";
	document.getElementById("P27").style.display = "none";
	document.getElementById("P28").style.display = "none";
	document.getElementById("P29").style.display = "none";
	document.getElementById("P30").style.display = "none";
	document.getElementById("P31").style.display = "block";
	document.getElementById("P32").style.display = "block";
	document.getElementById("P33").style.display = "block";
	document.getElementById("P34").style.display = "block";
	document.getElementById("P35").style.display = "block";
	document.getElementById("P36").style.display = "block";
	document.getElementById("P37").style.display = "block";
	document.getElementById("P38").style.display = "block";
	document.getElementById("P39").style.display = "block";
	document.getElementById("P40").style.display = "block";
	document.getElementById("P41").style.display = "none";
	document.getElementById("P42").style.display = "none";
	document.getElementById("P43").style.display = "none";
	document.getElementById("P44").style.display = "none";
	document.getElementById("P45").style.display = "none";
	document.getElementById("P46").style.display = "none";
	document.getElementById("P47").style.display = "none";
	document.getElementById("P48").style.display = "none";
	document.getElementById("P49").style.display = "none";
	document.getElementById("P50").style.display = "none";
}

function showCont5() {
	document.getElementById("imgMap").src = "/assets/radar/5.png";
	document.getElementById("C1").style.display = "none";
	document.getElementById("C2").style.display = "none";
	document.getElementById("C3").style.display = "none";
	document.getElementById("C4").style.display = "none";
	document.getElementById("C5").style.display = "none";
	document.getElementById("T").style.display = "block";
	document.getElementById("P1").style.display = "none";
	document.getElementById("P2").style.display = "none";
	document.getElementById("P3").style.display = "none";
	document.getElementById("P4").style.display = "none";
	document.getElementById("P5").style.display = "none";
	document.getElementById("P6").style.display = "none";
	document.getElementById("P7").style.display = "none";
	document.getElementById("P8").style.display = "none";
	document.getElementById("P9").style.display = "none";
	document.getElementById("P10").style.display = "none";
	document.getElementById("P11").style.display = "none";
	document.getElementById("P12").style.display = "none";
	document.getElementById("P13").style.display = "none";
	document.getElementById("P14").style.display = "none";
	document.getElementById("P15").style.display = "none";
	document.getElementById("P16").style.display = "none";
	document.getElementById("P17").style.display = "none";
	document.getElementById("P18").style.display = "none";
	document.getElementById("P19").style.display = "none";
	document.getElementById("P20").style.display = "none";
	document.getElementById("P21").style.display = "none";
	document.getElementById("P22").style.display = "none";
	document.getElementById("P23").style.display = "none";
	document.getElementById("P24").style.display = "none";
	document.getElementById("P25").style.display = "none";
	document.getElementById("P26").style.display = "none";
	document.getElementById("P27").style.display = "none";
	document.getElementById("P28").style.display = "none";
	document.getElementById("P29").style.display = "none";
	document.getElementById("P30").style.display = "none";
	document.getElementById("P31").style.display = "none";
	document.getElementById("P32").style.display = "none";
	document.getElementById("P33").style.display = "none";
	document.getElementById("P34").style.display = "none";
	document.getElementById("P35").style.display = "none";
	document.getElementById("P36").style.display = "none";
	document.getElementById("P37").style.display = "none";
	document.getElementById("P38").style.display = "none";
	document.getElementById("P39").style.display = "none";
	document.getElementById("P40").style.display = "none";
	document.getElementById("P41").style.display = "block";
	document.getElementById("P42").style.display = "block";
	document.getElementById("P43").style.display = "block";
	document.getElementById("P44").style.display = "block";
	document.getElementById("P45").style.display = "block";
	document.getElementById("P46").style.display = "block";
	document.getElementById("P47").style.display = "block";
	document.getElementById("P48").style.display = "block";
	document.getElementById("P49").style.display = "block";
	document.getElementById("P50").style.display = "block";
}