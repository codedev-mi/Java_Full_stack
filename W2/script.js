function validateForm() {
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const age = document.getElementById("age").value.trim();
  const gender = document.getElementById("gender").value;
  const course = document.getElementById("course").value.trim();
  const address = document.getElementById("address").value.trim();
  const errorMessage = document.getElementById("error-message");

  errorMessage.innerText = "";

  if (!name || !email || !age || !gender || !course || !address) {
    errorMessage.innerText = "Please fill in all fields.";
    return false;
  }

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailRegex.test(email)) {
    errorMessage.innerText = "Please enter a valid email address.";
    return false;
  }

  const ageNum = parseInt(age);
  if (isNaN(ageNum) || ageNum < 10 || ageNum > 100) {
    errorMessage.innerText = "Please enter a valid age between 10 and 100.";
    return false;
  }

  alert("Form submitted successfully!");
  return true;
}
