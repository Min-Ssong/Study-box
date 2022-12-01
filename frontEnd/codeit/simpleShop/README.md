# simpleShop
<pre>
22.11.22 Display
가운데 정렬하는 법
    가로 가운데 정렬
        inline 요소 : 부모태그에 text-align : center;
        block 요소 : margin-left: auto, margin-rigth: auto;(margin: 0 auto; <- 실험)
    세로 가운데 정렬
        가짜 요소 더하기
            
vertical-align : 박스들을 배치할때 기준을 설정하는 속성
baseline : 모든 요소의 밑선
    text : 텍스트의 글자 아래
    img : 이미지가 끝나는 지점
    inline-block : div 마지막 글자의 아래
px : 절대값
rem : 상대값 html font-size에 따라 달라짐
em : 자신의 font-size에 따라 달라짐
% : 상위요소에 따라 달라짐k(margin, padding 위아래는 height가 아니라 width로 계산됨)
inline : 필요한 공간만 갖는 디스플레이
block : 최대한 많은 width를 갖는 디스플레이
inline-block : inline이지만 block 디스플레이처럼 width와 height를 갖는 디스플레이
img : block처럼 width, height를 줄 수 있지만 inline으로 취급됨

22.11.15 Box Model
content - padding - border - margin
content : 내용
padding : content를 감싸는 영역과 content사이의 공백
border : padding의 테두리
margin : padding과 padding사이의 공백
---------------------------------------------------------------------------
padding, margin을 주는 방법 4가지
padding-top, padding-right, padding-bottom, padding-left
padding: top right bottom left;
padding: top-bottom, right-left;
padding: all;
---------------------------------------------------------------------------
width : 가로길이
min-width : 최소 가로길이
max-width : 최대 가로길이
height : 세로길이
min-height : 최소 세로길이
max-height : 최대 세로길이
---------------------------------------------------------------------------
overflow : content가 과도하게 많을 때 사용하는 태그
    hidden : 넘쳐난 부분을 숨김
    visible : 그냥 넘치게 둠(기본값)
    scroll : 넘쳐난 부분을 스크롤로 볼 수 있게함
    auto : 알아서
---------------------------------------------------------------------------
테두리
border : 2px solid red;
margin, padding과 마찬가지로 top, bottom, left, right로 따로 지정가능
테두리 없애기
border: none;
border: 0;

border-radius : 테두리를 둥글게
background-color : 요소의 배경색 지정(투명은 transparent)
요소의 그림자(가로 세로 개별적으로 지정가능, 색지정가능, 흐림도 설정 가능)
    box-shadow : 50px(가로) 30px(세로) 5px(흐림도) 10px(그림자크기) red;
---------------------------------------------------------------------------
width, height를 주었을 때 기본적으로 content의 크기를 조절한다. 하지만
그러면 padding값과 border값을 수정해야 하기때문에 box-sizing을 해준다.
box-sizing: border-box;
---------------------------------------------------------------------------
배경
background-repeat: 배경이미지의 반복
background-size: 배경이미지 크기
background-position: 배경이 잘릴때 어디에 중심을 둘건지(핀을 생각)
</pre>