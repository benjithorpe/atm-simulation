const bgColor = document.getElementById('bgColor');
const fontColor = document.getElementById('fontColor');
const body = document.querySelector('body');
const text = document.querySelector('h1');
let bgColorText = document.querySelector('.bg-color-value');
let fontColorText = document.querySelector('.font-color-value');

bgColor.addEventListener('input', () => {
  body.style.backgroundColor = bgColor.value;
  bgColorText.innerText = bgColor.value;
  fontColorText.style.color = fontColor.value;
});

fontColor.addEventListener('input', () => {
  text.style.color = fontColor.value;
  fontColorText.style.color = fontColor.value;
  bgColorText.style.color = fontColor.value;
  fontColorText.innerText = fontColor.value;
})
