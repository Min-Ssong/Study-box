const quotes = [
    {
        quote : "일을 시작하는 방법은 말하는 것을 멈추고 행동으로 옮기는 것이다.",
        author : "월트 디즈니",
    },
    {
        quote : "더 열심히 일하면 할수록 운이 더 좋아진다는 것을 알게 된다.",
        author : "토마스 제퍼슨",
    },
    {
        quote : "모방에서 성공하기보다는 독창성에서 실패하는 것이 낫다.",
        author : "허먼 멜빌",
    },
    {
        quote : "성공하는 길과 실패하는 길은 거의 같다.",
        author : "콜린 데이비스",
    },
    {
        quote : "만약 당신이 그것을 원한다면 성공을 목표로 하지 말고 당신이 사랑하고 믿는 것을 하면 그것은 자연스럽게 이루어질 것이다.",
        author : "데이비드 프로스트",
    },
    {
        quote : "기회는 일어나는 게 아니라 당신이 만드는 것이다.",
        author : "크리스 그로서",
    },
    {
        quote : "돈 쫓는 것 멈추고 열정 쫓기 시작하라.",
        author : "토니 셰이",
    },
    {
        quote : "당신이 어려움을 겪고 항복하지 않기로 결정할 때, 그것이 힘이다.",
        author : "아놀드 슈왈제네거",
    },
    {
        quote : "나보다 시작이 나은 선수들이 있겠지만, 나는 끝이 강한 선수다.",
        author : "우사인 볼트",
    },
    {
        quote : "힘든 시간들은 절대로 오래가지 않지만, 강인한 사람들은 오래 간다.",
        author : "로버트 슐러",
    },
    {
        quote : "나는 인생에서 몇 번이고 반복해서 실패했고 그것이 내가 성공하는 이유이다.",
        author : "마이클 조던",
    },
    {
        quote : "당신이 키워진 틀에서 벗어나지 못하면, 당신은 세상이 얼마나 더 큰지 이해하지 못할 것이다.",
        author : "안젤리나 졸리",
    },
    {
        quote : "열심히 갈고, 열심히 빛납시다.",
        author : "드웨인 존슨",
    },
    {
        quote : "중요했기 때문에 아팠습니다.",
        author : "존 그린",
    },
    {
        quote : "해보기 전에는 결코 알 수 없을 것이다.",
        author : "익명",
    },
    {
        quote : "모든 벽에도 문이 있다.",
        author : "익명",
    },
    {
        quote : "구름 뒤엔 여전히 태양이 빛나고 있다.",
        author : "익명",
    },
    {
        quote : "매일 두려운 일을 한가지 하세요.",
        author : "익명",
    },
    {
        quote : "자신이 세상을 바꿀 수 있다고 생각할 만큼 미친 사람들이 바로 세상을 바꾸는 사람들입니다.",
        author : "익명",
    },
    {
        quote : "아예 안하는 것보단 늦게라도 하는 게 낫다.",
        author : "익명",
    },
    {
        quote : "충고는 해 줄 수 있으나, 행동하게 할 수는 없다.",
        author : "익명",
    },
]

const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todaysQuote = quotes[Math.floor(Math.random() * quotes.length)];

quote.innerText = todaysQuote.quote;
author.innerText = todaysQuote.author;