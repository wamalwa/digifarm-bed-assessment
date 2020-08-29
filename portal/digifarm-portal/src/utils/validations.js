let required = (propertyType) => {
  return (v) => (v && v.length > 0) || `You must input a ${propertyType}`;
};

let minLength = (propertyType, minLength) => {
  return (v) =>
    (v && v.length >= minLength) ||
    `${propertyType} must be at least ${minLength} characters`;
};

let maxLength = (propertyType, maxLength) => {
  return (v) =>
    (v && v.length <= maxLength) ||
    `${propertyType} must be less than ${maxLength} characters`;
};

let emailFormat = () => {
  let regex = /^\w+([.-]?\w+)*@\w+([.-]?\w+)*(\.\w{2,24})+$/;
  return (v) => (v && regex.test(v)) || "Must be a valid email";
};

let password = () => {
    let regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*(_|[^\w])).+$/;
    return (v) => (v && regex.test(v)) || "Password must contain an upper case letter, a numeric character, and a special character";
};

let matchesFields = (matchfield1, msg) => {
    return (v) => (v && v === matchfield1) || msg;
};

export default {
  required,
  minLength,
  maxLength,
  emailFormat,
  password,
  matchesFields
};
