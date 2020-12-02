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
    var nom1 = "Mina de Wolframio", nom5 = "Mina de Grafeno", nom2 = "Mina de Carbino", nom6 = "Mina de Acero", nom3 = "Recolector de Radiacion", nom7 = "Planta de Energia Solar", nom4 = "Hangar", nom8 = "Laboratorio de Investigacion";

    switch (comp.id) {
        case 'selectorImg':
            document.getElementById('buildingName').innerHTML = nom1;
            break;
        case 'selectorImg2':
            document.getElementById('buildingName').innerHTML = nom2;
            break;
        case 'selectorImg3':
            document.getElementById('buildingName').innerHTML = nom3;
            break;
        case 'selectorImg4':
            document.getElementById('buildingName').innerHTML = nom4;
            break;
        case 'selectorImg5':
            document.getElementById('buildingName').innerHTML = nom5;
            break;
        case 'selectorImg6':
            document.getElementById('buildingName').innerHTML = nom6;
            break;
        case 'selectorImg7':
            document.getElementById('buildingName').innerHTML = nom7;
            break;
        case 'selectorImg8':
            document.getElementById('buildingName').innerHTML = nom8;
            break;
    }

    changeDisplay(original);
    document.getElementById('selectorImgChosen').src = original;

}

function researchingDeploy(comp) {
    var original = comp.src;
    var nom1 = "Tecnología de Energía", nom2 = "Tecnología de IA", nom3 = "Tecnología de Espionaje", nom4 = "Tecnología Militar", nom5 = "Tecnología de Blindaje", nom6 = "Tecnología Armamentística";

    switch (comp.id) {
        case 'selectorImg':
            document.getElementById('researchName').innerHTML = nom1;
            break;
        case 'selectorImg2':
            document.getElementById('researchName').innerHTML = nom2;
            break;
        case 'selectorImg3':
            document.getElementById('researchName').innerHTML = nom3;
            break;
        case 'selectorImg4':
            document.getElementById('researchName').innerHTML = nom4;
            break;
        case 'selectorImg5':
            document.getElementById('researchName').innerHTML = nom5;
            break;
        case 'selectorImg6':
            document.getElementById('researchName').innerHTML = nom6;
            break;
    }

    changeDisplay(original);
    document.getElementById('selectorImgChosen').src = original;

}

function troupDeploy(comp) {
    var original = comp.src;
    var vh0 = "Espía", vh1 = "Avispa", vh2 = "Cazador Ligero", vh3 = "Cazador Pesado", vh4 = "Carguero Ligero", vh5 = "Carguero Pesado", vh6 = "Escolta", vh7 = "Asaltador Ligero", vh8 = "Asaltador Pesado", vh9 = "Acorazado", vh10 = "Bombardero", vh11 = "Destructor", vh12 = "Gran Wick";
    var d0 = "El Muro", d1 = "Araña", d2 = "Lanzamisiles", d3 = "Torre Cañón", d4 = "Defensor", d5 = "Antiasedio", d6 = "Tron-X", d7 = "LaserDog"

    switch (comp.id) {
        case 'selectorImg':
            document.getElementById('troupName').innerHTML = vh1;
            break;
        case 'selectorImg2':
            document.getElementById('troupName').innerHTML = vh7;
            break;
        case 'selectorImg3':
            document.getElementById('troupName').innerHTML = vh10;
            break;
        case 'selectorImg4':
            document.getElementById('troupName').innerHTML = vh4;
            break;
        case 'selectorImg5':
            document.getElementById('troupName').innerHTML = vh0;
            break;
        case 'selectorImg6':
            document.getElementById('troupName').innerHTML = d2;
            break;
        case 'selectorImg7':
            document.getElementById('troupName').innerHTML = d5;
            break;
        case 'selectorImg8':
            document.getElementById('troupName').innerHTML = vh2;
            break;
        case 'selectorImg9':
            document.getElementById('troupName').innerHTML = vh8;
            break;
        case 'selectorImg10':
            document.getElementById('troupName').innerHTML = vh11;
            break;
        case 'selectorImg11':
            document.getElementById('troupName').innerHTML = vh5;
            break;
        case 'selectorImg12':
            document.getElementById('troupName').innerHTML = d0;
            break;
        case 'selectorImg13':
            document.getElementById('troupName').innerHTML = d3;
            break;
        case 'selectorImg14':
            document.getElementById('troupName').innerHTML = d6;
            break;
        case 'selectorImg15':
            document.getElementById('troupName').innerHTML = vh3;
            break;
        case 'selectorImg16':
            document.getElementById('troupName').innerHTML = vh9;
            break;
        case 'selectorImg17':
            document.getElementById('troupName').innerHTML = vh12;
            break;
        case 'selectorImg18':
            document.getElementById('troupName').innerHTML = vh6;
            break;
        case 'selectorImg19':
            document.getElementById('troupName').innerHTML = d1;
            break;
        case 'selectorImg20':
            document.getElementById('troupName').innerHTML = d4;
            break;
        case 'selectorImg21':
            document.getElementById('troupName').innerHTML = d7;
            break;
    }

    changeDisplay(original);
    document.getElementById('selectorImgChosen').src = original;

}

function changeDisplay(original) {
    if (document.getElementById('selectorImgChosen').src != original) {
        document.getElementById('selectorChosen').style.display = "block";
    } else {
        if (document.getElementById('selectorChosen').style.display != "block") {
            document.getElementById('selectorChosen').style.display = "block";
        } else {
            document.getElementById('selectorChosen').style.display = "none";
        }
    }
}

function changeSettlement(comp) {
    var originalCBackground = comp.src;
    document.body.style.backgroundImage = "url(" + originalCBackground + ")";
}

function changeSettlementGeneral(comp) {
    var originalCBackground = comp.src;
    document.getElementById('backgroundMainSection').style.backgroundImage = "url(" + originalCBackground + ")";
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