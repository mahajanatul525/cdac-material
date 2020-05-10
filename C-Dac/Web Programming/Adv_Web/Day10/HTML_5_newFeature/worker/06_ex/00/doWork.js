self.addEventListener('message', function(e) {


  self.postMessage("glad "+e.data+"  bye");
}, false);