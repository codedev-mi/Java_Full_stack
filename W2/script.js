document.querySelector('form').addEventListener('submit', function(event) {
  event.preventDefault(); 

  const firstName = this.querySelector('input[placeholder*="FisrtName"]').value.trim();
  const lastName = this.querySelector('input[placeholder*="LastName"]').value.trim();
  const email = this.querySelector('input[type="email"]').value.trim();
  
  const gender = this.querySelector('input[type="radio"]:checked');
  
  const course = this.querySelector('input[placeholder*="Course"]').value.trim();

  if (!gender) {
    alert('Please select your gender.');
    return;
  }

  alert(
    `First Name: ${firstName}\n` +
    `Last Name: ${lastName}\n` +
    `Email: ${email}\n` +
    `Gender: ${gender.value}\n` +
    `Course: ${course}`
  );
});
