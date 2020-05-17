var basicLink= document.querySelector('#basicLink');
var AcadDetailsLink = document.querySelector('#AcadDetailsLink');
var profilepicLink = document.querySelector('#profile-picLink');
var TechnicalDetailsLink = document.querySelector('#TechnicalDetailsLink');
var ExtraCurricularActivitiesLink = document.querySelector('#Extra-Curricular-ActivitiesLink');
var basicDetails= document.querySelector('.basic-details');
var AcadDetails= document.querySelector('.AcadDetails');
var btnExtraCurricularActivities = document.querySelector("#Extra-Curricular-Activities");
var profilepic= document.querySelector('.profile-pic');
var TechnicalDetails= document.querySelector('.TechnicalDetails');
var Extra = document.querySelector('.Extra');
var btnaddProjects = document.querySelector("#btnAddProjects");
var btnAddSubjects = document.querySelector("#btnAddSubjects");
var btnAddTechnicalSkills = document.querySelector("#btnAddTechnicalSkills");
var generateresume = document.querySelector("#GenerateResume");
var username = "";
var email = "";
var mobile = "";
var DegreeName = "";
var college ="";
var profile ="";
var extras = new Array();
var projects = new Array();
var techSkills = new Array();
var subs = new Array();
var basicdetailsSubmit = document.querySelector("#basic-detailsSubmit");
var AcadDetailsSubmit = document.querySelector("#AcadDetailsSubmit");
var profilepicSubmit = document.querySelector("#picture");
var TechnicalDetailsSubmit = document.querySelector("#TechnicalDetailsSubmit");
var ExtraSubmit = document.querySelector("#ExtraSubmit");
var img = document.querySelector("#showimage");
basicdetailsSubmit.addEventListener("click",  function functionName() {

username = document.querySelector("#Name").value;
email = document.querySelector("#Email").value;
mobile = document.querySelector("#Mobile").value;
if(verifybasic())
{
  basicLink.style.color = "green";

}else{
  basicLink.style.color = "red";
   alert("fill basic details properly ");
}

} ) ;

function verifybasic()
{
  if(username.length>4 && email.length>0 && mobile.length>9 && mobile.length<14 )
{
  return true;
}else
{
  return false;
}

}
AcadDetailsSubmit.addEventListener("click", function functionName() {

  DegreeName = document.querySelector("#DegreeName").value;
  college = document.querySelector("#college").value;
  if(verifyAcad())
  {
    AcadDetailsLink.style.color = "green";

  }else{
    AcadDetailsLink.style.color = "red";
     alert("fill Acad details properly ");
  }

});
function verifyAcad()
{
  if(DegreeName.length>1 && college.length>0  )
{
  return true;
}else
{
  return false;
}

}


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
     try {
        localStorage.setItem("imgData", getBase64Image(img));
    }
    catch (e) {
        console.log("Storage failed: " + e);
    }

 };

 fReader.readAsDataURL(file);
 if(verifyprofilepic())
 {
   profilepicLink.style.color = "green";

 }else{
   profilepicLink.style.color = "red";
alert("profile pic not uploaded")
 }
});

function verifyprofilepic()
{
  if( (img.src).length >0)
  {
    return true;
  }else{
    return false;
  }
}

TechnicalDetailsSubmit.addEventListener("click", function() {
  if(verifytechnical())
  {
    TechnicalDetailsLink.style.color = "green";
  }else{
    TechnicalDetailsLink.style.color = "red";
    alert("please fill tech details");

  }
});

function verifytechnical()
{
  if(techSkills.length > 0 && subs.length>0 && projects.length>0)
  {
    return true;
  }
  return false;
}


generateresume.addEventListener("click", function()
{
  if(verifybasic() && verifytechnical() && verifyprofilepic() && verifyAcad())
  {
    window.location.href="resume.html";
  }else{
    alert("please fill marked details")
  }
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


btnAddSubjects.addEventListener("click" ,function()
{
  var addsubject = document.querySelector("#addsubject").value;
  var subjects =   document.querySelector("#subjects");
  var li = document.createElement('li');
  if(addsubject.length>0)
  {
  li.appendChild(document.createTextNode(addsubject));
   subjects.appendChild(li);
   subs.push(addsubject);
 }


});
btnaddProjects.addEventListener("click" ,function()
{
  var addProjects = document.querySelector("#addProjects").value;
  var Projects =   document.querySelector("#Projects");
  var li = document.createElement('li');
  if(addProjects.length>0)
  {
  li.appendChild(document.createTextNode(addProjects));
   Projects.appendChild(li);
   projects.push(addProjects);
  }


});
btnExtraCurricularActivities.addEventListener("click" , function()
{
    var extravalue = document.querySelector("#Extra").value;
    var extra =   document.querySelector("#extraadds");
    var li = document.createElement('li');
    if(extravalue.length>0)
    {
    li.appendChild(document.createTextNode(extravalue));
     extra.appendChild(li);
     extras.push(extravalue);
   }

});
btnAddTechnicalSkills.addEventListener("click" , function()
{
    var addTechnicalSkills = document.querySelector("#addTechnicalSkills").value;
    var TechnicalSkills =   document.querySelector("#TechnicalSkills");
    var li = document.createElement('li');
    if(addTechnicalSkills.length>0)
    {
    li.appendChild(document.createTextNode(addTechnicalSkills));
     TechnicalSkills.appendChild(li);
     techSkills.push(addTechnicalSkills);
   }

});
