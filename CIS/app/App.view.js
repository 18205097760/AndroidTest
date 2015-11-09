'use strict';

define([
    'backbone', 'react', 'jsx!Router.jsx', 'react.backbone', 'jquery', 
], function (Backbone, React, Router, ReactBackbone, $) {

  React.render(
    <ul className="nav nav-pills">
      <li role="presentation" className="active"><a href="#">Home</a></li>
      <li role="presentation"><a href="#">Profile</a></li>
      <li role="presentation"><a href="#">Messages</a></li>
    </ul>,
    $("#app")[0]
  );
});
