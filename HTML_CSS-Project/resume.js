var basicLink= document.querySelector('#basicLink');
var AcadDetailsLink = document.querySelector('#AcadDetailsLink');
var profilepicLink = document.querySelector('#profile-picLink');
var TechnicalDetailsLink = document.querySelector('#TechnicalDetailsLink');
var ExtraCurricularActivitiesLink = document.querySelector('#Extra-Curricular-ActivitiesLink');
var basicDetails= document.querySelector('.basic-details');
var AcadDetails= document.querySelector('.AcadDetails');
var profilepic= document.querySelector('.profile-pic');
var TechnicalDetails= document.querySelector('.TechnicalDetails');
var Extra = document.querySelector('.Extra');
var generateresume = document.querySelector("#GenerateResume");
var username = "";
var email = "";
var mobile = "";
var DegreeName = "";
var college ="";
var profile ="";
var projects = new Array();
var basicdetailsSubmit = document.querySelector("#basic-detailsSubmit");
var AcadDetailsSubmit = document.querySelector("#AcadDetailsSubmit");
var profilepicSubmit = document.querySelector("#picture");
var TechnicalDetailsSubmit = document.querySelector("#TechnicalDetailsSubmit");
var ExtraSubmit = document.querySelector("#ExtraSubmit");
var img = document.querySelector("#showimage");
basicdetailsSubmit.addEventListener("click",  function functionName() {

username = document.querySelector("Name").value;
email = document.querySelector("Email").value;
mobile = document.querySelector("Mobile").value;

} ) ;
AcadDetailsSubmit.addEventListener("click", function functionName() {

  DegreeName = document.querySelector("DegreeName").value;
  college = document.querySelector("college").value;
});
profilepicSubmit.addEventListener("change", function() {
  var file = this.files[0];

 if (file.type.indexOf('image') < 0) {
     alert('invalid type');
     return;
 }


 var fReader = new FileReader();

 // Add complete behavior
 fReader.onload = function() {
     // Show the uploaded image to banner.
     img.src = fReader.result;
     img.style.width = "90px";
     img.style.border = "solid red";

     // Save it when data complete.
     // Use your function will ensure the format is png.

     // You can just use as its already a string.
     try {
        localStorage.setItem("imgData", getBase64Image(img));
    }
    catch (e) {
        console.log("Storage failed: " + e);
    }

 };

 fReader.readAsDataURL(file);
});
generateresume.addEventListener("click", function()
{
  if(verifyBasicDetails)
  window.location.href="resume.html";

});
function getBase64Image(img) {
    var canvas = document.createElement("canvas");
    canvas.width = img.width;
    canvas.height = img.height;

    var ctx = canvas.getContext("2d");
    ctx.drawImage(img, 0, 0);

    var dataURL = canvas.toDataURL("image/png");

    return dataURL.replace(/^data:image\/(png|jpg);base64,/, "");
}



function hideAll()
{
  basicDetails.style.display="none";
  AcadDetails.style.display="none";
  profilepic.style.display="none";
  TechnicalDetails.style.display="none";
  Extra.style.display="none";
}



window.addEventListener("DOMContentLoaded", function(){
hideAll();
});

basicLink.addEventListener('click',function functionName(){
  hideAll();
  basicDetails.style.display="block";
});
AcadDetailsLink.addEventListener('click',function functionName() {
  hideAll();
AcadDetails.style.display="block";

});
profilepicLink.addEventListener('click',function functionName() {
  hideAll();
profilepic.style.display="block";

});


TechnicalDetailsLink.addEventListener('click',function functionName() {
  hideAll();
TechnicalDetails.style.display="block";

});
ExtraCurricularActivitiesLink.addEventListener('click',function functionName() {
  hideAll();
Extra.style.display="block";

});
