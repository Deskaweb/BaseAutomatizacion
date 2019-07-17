$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "Ingresar a Google y hacer una busqueda",
  "description": "",
  "id": "ingresar-a-google-y-hacer-una-busqueda",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Realizar una busqueda en Google",
  "description": "",
  "id": "ingresar-a-google-y-hacer-una-busqueda;realizar-una-busqueda-en-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "se entra a Google",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "se busca la frase",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSteps.EntrarAGoogle()"
});
formatter.result({
  "duration": 5475386745,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.BuscarPalabra()"
});
formatter.result({
  "duration": 1238789905,
  "status": "passed"
});
});