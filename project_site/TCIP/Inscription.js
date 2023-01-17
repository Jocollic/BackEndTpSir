inscrit={"teams":[], "membre":[]};

function enregistrerEquipe() {
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

    
function ajoute_participant2() {
    if (($("#equipe").val()==="") || ($("#participant1").val()==="")) return;

    inscrit.teams.push([$("#equipe").val()]);
    inscrit.membre.push([$("#participant1").val(),$("#participant2").val(),$("#participant3").val(),$("#participant4").val()]);

    enregistrerEquipe();
    $("#equipe").val("");
    $("#participant1").val("");
    $("#participant2").val("");
    $("#participant3").val("");
    $("#participant4").val("");
}


function viderInscrit() {
    inscrit={"teams":[], "membre":[]};
    enregistrerEquipe()
}


 $(document).ready(function(){
    $.ajaxSetup({ cache: false });
    $.getJSON( "ListeEquipe.json", function( data ) {
        inscrit=data;
    });

    $("#ajouterParticipant").click(ajoute_participant2);
    $("#viderAll").click(viderInscrit);
 });




