document.addEventListener('DOMContentLoaded', () => {
    const responses = JSON.parse(localStorage.getItem('riskResponses')) || [];
    const questions = JSON.parse(localStorage.getItem('riskQuestions')) || [];

    if (responses.length === 0 || questions.length === 0) {
        alert('No assessment data found! Please complete the form first.');
        window.location.href = '/';
        return;
    }

    // Create question map
    const questionMap = {};
    questions.forEach(q => questionMap[q.id] = q.text);

    // Display risks
    const highList = document.getElementById('high-risks');
    const lowList = document.getElementById('low-risks');

    // Replace your existing list code with:
    responses.filter(r => r.score === 1).forEach(r => {
        const li = document.createElement('li');
        li.textContent = `${questionMap[r.questionId]} (Score: ${r.score})`;
        highList.appendChild(li);
    });

    responses.filter(r => r.score === 5).forEach(r => {
        const li = document.createElement('li');
        li.textContent = `${questionMap[r.questionId]} (Score: ${r.score})`;
        lowList.appendChild(li);
    });


    // Setup chart
    const scoreGroups = {
        'Critical Risk (1)': responses.filter(r => r.score === 1).length,
        'Medium Risk (2-4)': responses.filter(r => r.score >= 2 && r.score <= 4).length,
        'Safe (5)': responses.filter(r => r.score === 5).length
    };

    new Chart(document.getElementById('riskChart'), {
        type: 'pie',
        data: {
            labels: Object.keys(scoreGroups),
            datasets: [{
                data: Object.values(scoreGroups),
                backgroundColor: ['#ff4444', '#ffbb33', '#00c851']
            }]
        },
        options: {
            plugins: {
                legend: {
                    labels: {
                        font: {
                            family: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
                            size: 12
                        }
                    },
                    position: 'bottom'
                }
            }
        }
    });

});