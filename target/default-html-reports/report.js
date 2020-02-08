$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseForeignCurrency.feature");
formatter.feature({
  "name": "Purchase Foreign Currency",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Available currencies",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user accesses the Purchase foreign currency cash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.the_user_accesses_the_Purchase_foreign_currency_cash_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "following currencies should be available",
  "rows": [
    {
      "cells": [
        "Select One"
      ]
    },
    {
      "cells": [
        "Australia (dollar)"
      ]
    },
    {
      "cells": [
        "Canada (dollar)"
      ]
    },
    {
      "cells": [
        "Switzerland (franc)"
      ]
    },
    {
      "cells": [
        "China (yuan)"
      ]
    },
    {
      "cells": [
        "Denmark (krone)"
      ]
    },
    {
      "cells": [
        "Eurozone (euro)"
      ]
    },
    {
      "cells": [
        "Great Britain (pound)"
      ]
    },
    {
      "cells": [
        "Hong Kong (dollar)"
      ]
    },
    {
      "cells": [
        "Japan (yen)"
      ]
    },
    {
      "cells": [
        "Mexico (peso)"
      ]
    },
    {
      "cells": [
        "Norway (krone)"
      ]
    },
    {
      "cells": [
        "New Zealand (dollar)"
      ]
    },
    {
      "cells": [
        "Sweden (krona)"
      ]
    },
    {
      "cells": [
        "Singapore (dollar)"
      ]
    },
    {
      "cells": [
        "Thailand (baht)"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.following_currencies_should_be_available(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Error message for not selecting currency",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user accesses the Purchase foreign currency cash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.the_user_accesses_the_Purchase_foreign_currency_cash_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to calculate cost without selecting a currency",
  "keyword": "When "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.user_tries_to_calculate_cost_without_selecting_a_currency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Error message for not entering value",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user accesses the Purchase foreign currency cash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.the_user_accesses_the_Purchase_foreign_currency_cash_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to calculate cost without entering a value",
  "keyword": "When "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.user_tries_to_calculate_cost_without_entering_a_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseForeignCurrencyStepDefs.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});