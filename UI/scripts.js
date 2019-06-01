var tasks = [
    {id: 6, text: "Сделать заголовок", isImportant: false, isCompleted: false},
    {id: 3, text: "Прикрутить JS", isImportant: true, isCompleted: true},
    {id: 8, text: "Сделать сделать список с элементами", isImportant: false, isCompleted: false},
    {id: 11, text: "Сделать поле для ввода новых задач", isImportant: false, isCompleted: false},
    {id: 0, text: "Сделать красиво", isImportant: true, isCompleted: false},
    {id: 32, text: "Сдать задание", isImportant: false, isCompleted: true}
];

var lastId = 32;

$(document).ready(function () {
    drawList();
});

function drawList() {
    var $table = $("#tasks-table");
    //Очищаем таблицу от старых записей, если они были
    $table.html("");
    if (tasks.length !== 0) {
        $("#no-tasks-header").hide();
        for (var i in tasks) {
            var tableRow = document.createElement("tr");

            var tdCheckbox = document.createElement("td");
            var checkbox = document.createElement("input");
            checkbox.type = "checkbox";
            if (tasks[i].isCompleted) {
                checkbox.checked = true;
            }
            checkbox.onchange = checkTask(tasks[i].id);
            tdCheckbox.append(checkbox);
            tableRow.append(tdCheckbox);

            var tdText = document.createElement("td");
            tdText.innerText = tasks[i].text;
            if (tasks[i].isImportant) {
                tdText.className = "important";
            }
            if (tasks[i].isCompleted) {
                if (tdText.className === "") {
                    tdText.className = "completed";
                } else {
                    tdText.className += " completed";
                }
            }
            tdText.onclick = checkTask(tasks[i].id);
            tableRow.append(tdText);

            var tdDeleteButton = document.createElement("td");
            var deleteButton = document.createElement("button");
            deleteButton.onclick = removeTask(tasks[i].id);
            deleteButton.innerText = "Удалить";
            tdDeleteButton.append(deleteButton);
            tableRow.append(tdDeleteButton);
            //Важные выводятся в начале списка
            if (tasks[i].isImportant) {
                $table.prepend(tableRow);
            } else {
                $table.append(tableRow);
            }
        }
    } else {
        $("#no-tasks-header").show();
    }
}

function addTask() {
    var $textInput = $('#text-input');
    var text = $textInput.val();
    var isImportant = $('#new-important-checkbox').is(":checked");

    if (text === "") {
        alert("Необходимо ввести текст задачи.");
    } else {
        var newTask = {};
        newTask.id = ++lastId;
        newTask.text = text;
        newTask.isImportant = isImportant;
        newTask.isCompleted = false;
        tasks.push(newTask);
        $textInput.val("");
        drawList();
    }
}

function checkTask(taskId) {
    return function () {
        for (var i = 0; i < tasks.length; i++) {
            if (tasks[i].id === taskId) {
                tasks[i].isCompleted = !tasks[i].isCompleted;
                break;
            }
        }
        drawList();
    }
}

function removeTask(taskId) {
    return function () {
        for (var i = 0; i < tasks.length; i++) {
            if (tasks[i].id === taskId) {
                tasks.splice(i, 1);
                break;
            }
        }
        drawList();
    };
}

