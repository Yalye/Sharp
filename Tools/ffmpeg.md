


install x264
./configure --prefix=/usr/local/x264 --enable-shared --enable-static --enable-yasm

install ffmpeg
./configure --prefix=/usr/local/ffmpeg/ffmpeg --enable-shared --enable-yasm --enable-libx264 --enable-gpl --enable-pthreads --extra-cflags=-I/usr/local/x264/include --extra-ldflags=-L/usr/local/x264/lib

convert to 264 mp4 format
ffmpeg -y -i hevc.mp4 -vcodec h264 -strict -2 hevc_to_264.mp4