import React from 'react';
import {NativeModules, Text, TouchableOpacity, View} from 'react-native';

import styles from './components/Style';

const {VideoPOCModule} = NativeModules;

const App = () => {
  const joinChannel = () => {
    VideoPOCModule.joinChannel();
  };

  return (
    <View style={styles.max}>
      <View style={styles.max}>
        <View style={styles.buttonHolder}>
          <TouchableOpacity onPress={joinChannel} style={styles.button}>
            <Text style={styles.buttonText}> Join Channel </Text>
          </TouchableOpacity>
        </View>
      </View>
    </View>
  );
};

export default App;
