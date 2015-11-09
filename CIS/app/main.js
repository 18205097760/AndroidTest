'use strict';

require.config({
    paths: {

        jquery: "../lib/jquery/jquery.min",
        bootstrap: "../lib/bootstrap/js/bootstrap.min",
        react: "../lib/react/react-with-addons.min",

        "JSXTransformer": '../lib/jsx/JSXTransformer',
        jsx: '../lib/jsx/jsx',
        'react.backbone': '../lib/jsx/react.backbone',

        backbone: '../lib/jsx/backbone',
        underscore: '../lib/jsx/lodash.min',

        text: '../lib/jsx/text',
        json: '../lib/jsx/json',
        mdown: '../lib/jsx/mdown',
    },
    shim: {
        underscore:{
            exports: '_'
        },
        backbone: {
            deps: ['underscore', 'jquery'],
            exports: 'Backbone'
        }
    }
});

require([
    'backbone', 'jsx!App.view'
], function (Backbone, App) {
    //App;
});
