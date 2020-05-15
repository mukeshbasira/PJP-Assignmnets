

var img = document.querySelector("#tableBanner");
function fetchimage () {
  var dataImage = localStorage.getItem('imgData');
  img.src = "data:image/png;base64," + dataImage;
}
fetchimage();
