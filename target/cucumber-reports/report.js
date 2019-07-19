$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("miArgentina.feature");
formatter.feature({
  "line": 1,
  "name": "Ingresar a la Web MI ARGENTINA",
  "description": "",
  "id": "ingresar-a-la-web-mi-argentina",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Ingresar a la Web MI ARGENTINA",
  "description": "",
  "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "se ingresa a la web Mi Argentina",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "se ingresa con el usuario \"\u003cUser\u003e\" y la \"\u003cPass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "se verifica menu princial",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "se ingresa al menu \"\u003cMenu\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina;",
  "rows": [
    {
      "cells": [
        "User",
        "Pass",
        "Menus"
      ],
      "line": 10,
      "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina;;1"
    },
    {
      "cells": [
        "20387030019",
        "Pda@1305",
        "Billetera"
      ],
      "line": 11,
      "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina;;2"
    },
    {
      "cells": [
        "20375568897",
        "37556889Ga",
        "Salud"
      ],
      "line": 12,
      "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Ingresar a la Web MI ARGENTINA",
  "description": "",
  "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "se ingresa a la web Mi Argentina",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "se ingresa con el usuario \"20387030019\" y la \"Pda@1305\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "se verifica menu princial",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "se ingresa al menu \"\u003cMenu\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionMiArgentina.EntrarAGoogle()"
});
formatter.result({
  "duration": 10273460400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20387030019",
      "offset": 27
    },
    {
      "val": "Pda@1305",
      "offset": 46
    }
  ],
  "location": "DefinitionMiArgentina.IngresarConUser(String,String)"
});
formatter.result({
  "duration": 927189700,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionMiArgentina.VerificarMenuPrincipal()"
});
formatter.result({
  "duration": 6814710700,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat pages.MainPageMiArgentina.verificarMenuPrincipal(MainPageMiArgentina.java:42)\r\n\tat Steps.DefinitionMiArgentina.VerificarMenuPrincipal(DefinitionMiArgentina.java:54)\r\n\tat ✽.Then se verifica menu princial(miArgentina.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cMenu\u003e",
      "offset": 20
    }
  ],
  "location": "DefinitionMiArgentina.IngresarAMenu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Ingresar a la Web MI ARGENTINA",
  "description": "",
  "id": "ingresar-a-la-web-mi-argentina;ingresar-a-la-web-mi-argentina;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "se ingresa a la web Mi Argentina",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "se ingresa con el usuario \"20375568897\" y la \"37556889Ga\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "se verifica menu princial",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "se ingresa al menu \"\u003cMenu\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionMiArgentina.EntrarAGoogle()"
});
formatter.result({
  "duration": 8220404500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20375568897",
      "offset": 27
    },
    {
      "val": "37556889Ga",
      "offset": 46
    }
  ],
  "location": "DefinitionMiArgentina.IngresarConUser(String,String)"
});
formatter.result({
  "duration": 841879500,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionMiArgentina.VerificarMenuPrincipal()"
});
formatter.result({
  "duration": 6705514000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat pages.MainPageMiArgentina.verificarMenuPrincipal(MainPageMiArgentina.java:42)\r\n\tat Steps.DefinitionMiArgentina.VerificarMenuPrincipal(DefinitionMiArgentina.java:54)\r\n\tat ✽.Then se verifica menu princial(miArgentina.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cMenu\u003e",
      "offset": 20
    }
  ],
  "location": "DefinitionMiArgentina.IngresarAMenu(String)"
});
formatter.result({
  "status": "skipped"
});
});