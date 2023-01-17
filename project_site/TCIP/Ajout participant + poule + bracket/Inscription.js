inscrit={"teams":[], "membre":[]};

function sauver(data) {
    inscrit=data;
}
    
function enregistrer() {
    $.ajax({
    async:true,
    type:"POST",
    url:"enregistreEquipe.php",
    data:JSON.stringify(inscrit),
    datatype:"json",
    success: function(){alert("Enregistrement réussi");},
    error: function(){alert("Impossible d'enregistrer");}
    });
}

function liste_participants() {
    return inscrit.teams.flat().filter(function (el) {
    return el !== null;});
}
    
function ajoute_participant() {
    if ((inscrit.teams.length === 0) || ($("#participant1").val()==="")) return;

    inscrit.teams.push([$("#equipe").val()]);
    inscrit.membre.push([$("#participant1").val(),$("#participant2").val(),$("#participant3").val(),$("#participant4").val()]);

    enregistrer();
    $("#equipe").val("");
    $("#participant1").val("");
    $("#participant2").val("");
    $("#participant3").val("");
    $("#participant4").val("");
}


function vider() {
    inscrit={"teams":[], "membre":[]};
    
    enregistrer()
}


 $(document).ready(function(){
    $.ajaxSetup({ cache: false });
    $.getJSON( "ListeEquipe.json", function( data ) {
        inscrit=data;

    });

    $("#ajouter").click(ajoute_participant);
    $("#vider").click(vider);
 });




