<?php

  $items[0] = array('Snow in August', 
    'http://url',
    "It's snowing in August. Is this still the northern hemisphere?"
  );

  $items[1] = array('Trees are green', 
    'http://url',
    'Scientists determine that trees are green. Sky suspected to be blue.'
  );

  $items[2] = array('Stock market goes up and down', 
    'http://url',
    'Yes, the stock market went up and down today. Like always.'
  );


  header('Content-type: text/xml');

  echo '<?xml version="1.0" ?>';

  echo '<rss version="2.0">';

  echo '<channel>';

  echo '<title>Vital News</title>';
  echo '<link>http://url</link>';
  echo '<description>The most vital news stories anywhere</description>';
  echo '<language>en-us</language>';
  echo '<copyright>Copyright 2007</copyright>';
  echo '<webMaster>webmaster@url</webMaster>';

  foreach ($items as $data) {
    echo '<item>';
    echo "<title>{$data[0]}</title>";
    echo "<link>{$data[1]}</link>";
    echo "<description>{$data[2]}</description>";
    echo '</item>';

  }

  echo '</channel>';

  echo '</rss>';
?>
