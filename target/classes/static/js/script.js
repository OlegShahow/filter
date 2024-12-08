
"use strict";


// =============================радиокнопки===========================================


// Получаем все блоки с классом .dropdown-content
const dropdowns = document.querySelectorAll('.dropdown-content');

dropdowns.forEach(dropdown => {
    // Получаем все чекбоксы внутри текущего блока
    const checkboxes = dropdown.querySelectorAll('input[type="checkbox"]');

    checkboxes.forEach(checkbox => {
        // Добавляем обработчик события на каждый чекбокс
        checkbox.addEventListener('change', () => {
            // Если чекбокс выбран, то убираем выбор у всех других чекбоксов в этой группе
            if (checkbox.checked) {
                checkboxes.forEach(otherCheckbox => {
                    if (otherCheckbox !== checkbox) {
                        otherCheckbox.checked = false;
                    }
                });
            }
        });
    });
});


// ========================================================================================


const navBox = document.querySelector('.catalog__nav--box');
const catalogNav = document.querySelector('.catalog__nav');
const thanks = document.querySelector('.catalog__thanks');

const krestik = document.querySelector('.catalog__nav--icon');
const order = document.querySelector('.b1');
const closedBox = document.querySelector('.b2');

// ..................... открыть  блок ..................

navBox.addEventListener("click", (event) => {
    catalogNav.style.display = "flex";
    event.stopPropagation(); // Останавливаем всплытие события
})

// ..................... закрыть блок ..................
function closeded(event) {
    catalogNav.style.display = "none"; // Закрытие блока
    event.stopPropagation(); // Останавливаем всплытие события
}

closedBox.addEventListener('click', closeded);
krestik.addEventListener('click', closeded);

// ............................................................



// Обработчик для кнопки "Відправити замовлення"
order.addEventListener('click', (event) => {
    event.preventDefault(); // Останавливаем стандартное поведение (если это кнопка формы)
    event.stopPropagation(); // Останавливаем всплытие события, чтобы не закрывался блок

  
    // // Отправляем форму с данными
    // form.submit(); // Явная отправка формы через JavaScript

    // Показать сообщение об успешном заказе
    thanks.style.display = "block"; // Показать благодарность


    // Если нужно скрыть сообщение через несколько секунд:
    setTimeout(() => {
        thanks.style.display = "none"; // Скрыть сообщение благодарности через 5 секунд
        catalogNav.style.display = "none"; // Закрытие блока
    }, 7000);
});