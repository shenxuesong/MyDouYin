package com.shenxuesong.mydouyin.Bean;

public  class DataBean {

        private ChallengeBean challenge;
        private int type;
        private MusicBean music;

        public ChallengeBean getChallenge() {
            return challenge;
        }

        public void setChallenge(ChallengeBean challenge) {
            this.challenge = challenge;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public MusicBean getMusic() {
            return music;
        }

        public void setMusic(MusicBean music) {
            this.music = music;
        }
}