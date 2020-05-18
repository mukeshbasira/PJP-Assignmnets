var jsonString = localStorage.getItem("personObject");

var retrievedObject = JSON.parse(jsonString);
console.log(retrievedObject);

    fetchimage();
    fetchtechSkills();
    fetchBasicDetails();
    fetchExtras();
    fetchAcad();



function fetchimage () {


  var dataImage = localStorage.getItem('imgData');
  if(dataImage.length>0)
  {
  document.querySelector("#tableBanner").src = "data:image/png;base64," + dataImage;
}
}

function fetchtechSkills()
{
var subs = retrievedObject.subs;
  if(subs.length>0)
  {  var resumesubfill =   document.querySelector("#resumesubfill");
    for(i = 0;i<subs.length;i++)
    {

      var li = document.createElement('li');
      li.appendChild(document.createTextNode(subs[i]));
       resumesubfill.appendChild(li);
     }
    }
var projects = retrievedObject.projects;
    if(projects.length>0)
    {  var resumeprojfill =   document.querySelector("#resumeprojfill");
      for(i = 0;i<projects.length;i++)
      {

        var li = document.createElement('li');
        li.appendChild(document.createTextNode(projects[i]));
         resumeprojfill.appendChild(li);
       }
     }
     var techSkills = retrievedObject.techSkills;
      if(techSkills.length>0)
      {  var resumeskillsfill =   document.querySelector("#resumeskillsfill");
        for(i = 0;i<techSkills.length;i++)
        {

          var li = document.createElement('li');
          li.appendChild(document.createTextNode(techSkills[i]));
           resumeskillsfill.appendChild(li);
         }
        }


}
function fetchBasicDetails()
{
  document.querySelector('#name').innerHTML = "name :" +  retrievedObject.name;
    document.querySelector('#mobile').innerHTML = "mobile : " + retrievedObject.mobile;
  document.querySelector('#email').innerHTML =  "email :" +  retrievedObject.email;

}
function fetchAcad() {
document.querySelector('#degree').innerHTML = "degreename  :"+ retrievedObject.DegreeName;
document.querySelector('#college').innerHTML = "college  :" + retrievedObject.college;

}
function fetchExtras() {
 var extras = retrievedObject.extras;
if(extras.length>0)
{  var resumeExtras =   document.querySelector("#resumeExtras");
  for(i = 0;i<extras.length;i++)
  {

    var li = document.createElement('li');
    li.appendChild(document.createTextNode(extras[i]));
     resumeExtras.appendChild(li);
   }
  }

}
var pdf = document.querySelector('#pdf');
pdf.addEventListener("click",function()
{pdf.style.display="none";
  let doc = new jsPDF('p','pt','a4');

doc.addHTML(document.body,function() {
    doc.save('html.pdf');
    pdf.style.display = "block";
    
});
});
