<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="no">
    <head>
        <link href="css/simple.css" rel="stylesheet" type="text/css" />
        <title>Påmeldingsskjema</title>
    </head>

    <body>
        <h2>Påmeldingsskjema</h2>
        <form id="paameldingSkjema" action="http://localhost:8080/paameldingSkjema" method="post">
            <fieldset>
                <label for="fornavn">Fornavn</label>
                <input id="fornavn" name="fornavn" title="Skriv inn fornavnet ditt" placeholder="Fyll inn fornavn" required="required" type="text" value=""/>
                <br>
                <label for="etternavn">Etternavn</label>
                <input id="etternavn" name="etternavn" title="Skriv inn etternavnet ditt" placeholder="Fyll inn etternavn" required="required" type="text" value=""/>
                <br>
                <label for="mobil">Mobilnummer</label>
                <input id="mobil" name="mobil" title="Skriv inn ditt mobilnummer" placeholder="Fyll inn mobilnummeret ditt" required="required" type="text" value=""/>
                <br>
                <label for="passord">Passord</label>
                <input id="passord" name="passord" title="Lag Passord" placeholder="Lag passord" required="required" type="password" value="" />
                <br>
                <label for="passordRepetert">Repeter passord</label>
                <input id="passordRepetert" name="passordRepetert" title="repeterPassord" placeholder="Repeter passord" required="required" type="password" value=""/>
                <br>
                <label for="kjonn">Kjønn</label>
                <input id="kjonn1" name="kjonn" checked="checked" type="radio" value="mann"/>mann
                <input id="kjonn2" name="kjonn" type="radio" value="kvinne"/>kvinne
                <br>
                <br><br><button type="submit">Meld meg på</button>

                <br><p>Allerede påmeldt?</p>
                <a href="deltagerliste">Trykk her for å gå til innlogging</a>
            </fieldset>
        </form>
    </body>

</html>