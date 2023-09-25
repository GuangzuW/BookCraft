const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function (app) {
  app.use(
    '/api', // Specify the path you want to proxy
    createProxyMiddleware({
      target: 'http://localhost:8080', // URL of your backend server
      changeOrigin: true,
    })
  );
};
