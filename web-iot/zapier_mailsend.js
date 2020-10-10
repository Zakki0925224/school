function submit() {
  const url = "https://hooks.zapier.com/hooks/catch/xxxxxxx/xxxxxxx/";
  const data = "xxxxxxx@xxxxx.com";  //送信先メルアド（変更可能）

  const xml = new XMLHttpRequest();
  xml.open("POST", url, false);
  // xml.setRequestHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
  // xml.send(`payload=${JSON.stringify(data)}`)
  xml.send(data)
}
//メールのタイトルと本文はzapier側で設定済み。