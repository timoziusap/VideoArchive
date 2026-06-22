//Wird aufgerufen sobald die Seite geladen ist
$(document).ready(function() {
    addEventListeners();
    postData();
});

// Event Listener registrieren
function addEventListeners() {
    // Formular absenden -> neues Video anlegen
    $('#newVideo').submit(function(event) {
        event.preventDefault();
        addVideo();
    });

    // "Laden"-Button -> Tabelle befüllen
    $('#loadtable').click(function(event) {
        postData();
    });
}

// Neues Video per POST anlegen
function addVideo() {
    var formData = {
        'title':       $('[name=title]').val(),
        'description': $('[name=description]').val(),
        'ageRating':   $('[name=agerating]').val(),
        'genre':         $('[name=genre]').val(),
        'erstellerName': $('[name=ersteller]').val()
    };

    $.ajax({
        type: 'POST',
        url: '/videos',
        data: JSON.stringify(formData),
        contentType: 'application/json',
        success: function(data) {
            $('#newVideo')[0].reset();
            postData();
        },
        error: function(xhr, status, error) {
            alert('Fehler beim Anlegen: ' + error);
        }
    });
}

// Alle Videos laden und Tabelle befüllen
function postData() {
    $.ajax({
        type: 'GET',
        url: '/videos',
        success: function(data) {
            var table = $('#videotable').DataTable();
            table.clear();
            $.each(data, function(index, video) {
                table.row.add([
                    video.title,
                    video.description,
                    video.ageRating,
                    video.genre,
                    video.erstellerName
                ]);
            });
            table.draw();
        },
        error: function(xhr, status, error) {
            alert('Fehler beim Laden: ' + error);
        }
    });
}