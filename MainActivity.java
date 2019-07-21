var count = 0;
onEvent("upButton", "click", function() {
  count = count + 3;
  setText("countDisplayLabel", count);
  if (count == 21) {
    setScreen("gameOverScreen");
    setText("finalScoreLabel", count);
  }
});
onEvent("downButton", "click", function() {
  count = count - 3;
  setText("countDisplayLabel", count);
  if (count == -6) {
    setScreen("gameOverScreen");
    setText("finalScoreLabel", count);
  }
});
onEvent("startOverButton", "click", function() {
  count = 0;
  setText("countDisplayLabel", 0);
  setScreen("gamePlayScreen");
});
