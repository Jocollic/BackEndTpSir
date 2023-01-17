poule={"match":[[],[],[],[],[],[]], "results":[]};
EquipeList = {};

function enregistrerPoule() {
    $.ajax({
    async:true,
    type:"POST",
    url:"enregistrePoule.php",
    data:JSON.stringify(poule),
    datatype:"json",
    success: function(){alert("Enregistrement réussi");},
    error: function(){alert("Impossible d'enregistrer");}
    });
}

function distribution(){
    var k = 0;
    for(let i = 0; i < 4; i++){
        for(let j = i+1; j < 4; j++){
                poule.match[k][0] = EquipeList.teams[i] 
                poule.match[k][1] = EquipeList.teams[j]
                k++;
        }
    }
    k=0;
}

function scoreUpdate(){
    poule.results[0] =([$("#val1").val()]);
    poule.results[1] =([$("#val2").val()]);
    poule.results[2] =([$("#val3").val()]);
    poule.results[3] =([$("#val4").val()]);
    poule.results[4] =([$("#val5").val()]);
    poule.results[5] =([$("#val6").val()]);
}


function InputEquipe(){
    for(let i = 1; i < 5; i ++){    
        var MonIdX = "Equipe" + i + "-1"
        var MonIdY = "Equipe" + i + "-2"
        const changementX = document.getElementById(MonIdX);
        const changementY = document.getElementById(MonIdY);
        var equipeX = EquipeList.teams[i-1];
        var equipeY = EquipeList.teams[i-1];
        changementX.innerHTML = equipeX;
        changementY.innerHTML = equipeY;
    }
}


$(document).ready(function(){
    $.ajaxSetup({ cache: false });
    $.getJSON( "ListeEquipe.json", function( data ) {
        EquipeList.teams = data.teams;  
        distribution();
        InputEquipe();
    });

    $("#upAll").click(scoreUpdate);
    $("#enregistrerResult").click(enregistrerPoule);
 });





